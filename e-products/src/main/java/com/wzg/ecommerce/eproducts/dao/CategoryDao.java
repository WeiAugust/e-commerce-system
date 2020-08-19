package com.wzg.ecommerce.eproducts.dao;

import com.wzg.ecommerce.eproducts.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wzg
 * @email 285357487@qq.com
 * @date 2020-08-18 20:21:25
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
