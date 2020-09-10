package com.wzg.ecommerce.eproducts.service.impl;

import com.wzg.ecommerce.eproducts.service.CategoryBrandRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wzg.ecommerce.common.utils.PageUtils;
import com.wzg.ecommerce.common.utils.Query;

import com.wzg.ecommerce.eproducts.dao.CategoryDao;
import com.wzg.ecommerce.eproducts.entity.CategoryEntity;
import com.wzg.ecommerce.eproducts.service.CategoryService;
import org.springframework.transaction.annotation.Transactional;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Autowired
    CategoryBrandRelationService categoryBrandRelationService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listCategoryWithTree() {
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        categoryEntities.stream().filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .map(menu -> {menu.setChildren(getChildren(menu, categoryEntities));
                return menu;})
                .sorted(Comparator.comparingInt(a -> (a.getSort() == null ? 0 : a.getSort()))).collect(Collectors.toList());
        return categoryEntities;
    }

    @Override
    public void removeMenusByIds(List<Long> asList) {
        // TODO: 2020/8/20 检查其他地方是否引用该菜单 
        baseMapper.deleteBatchIds(asList);
    }

    @Override
    public Long[] findCatelogPath(Long catelogId) {
        List<Long> paths = new ArrayList<>();
        List<Long> parentPath = findParentPath(catelogId, paths);
        Collections.reverse(parentPath);
        return parentPath.toArray(new Long[parentPath.size()]);
    }

    private List<Long> findParentPath(Long catelogId, List<Long> paths) {
        paths.add(catelogId);
        CategoryEntity byId = this.getById(catelogId);
        if (byId.getParentCid() != 0) {
            findParentPath(byId.getParentCid(), paths);
        }
        return paths;
    }

    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {
        List<CategoryEntity> children = all.stream().filter(categoryEntity -> categoryEntity.getParentCid() == root.getCatId()).map(categoryEntity -> {
            categoryEntity.setChildren(getChildren(categoryEntity, all));
            return categoryEntity;
        }).sorted(Comparator.comparingInt(a -> (a.getSort() == null ? 0 : a.getSort()))).collect(Collectors.toList());
        return children;
    }

    @Transactional
    @Override
    public void updateCascade(CategoryEntity category) {
        this.updateById(category);
        categoryBrandRelationService.updateCategory(category.getCatId(), category.getName());
    }

}