package com.wzg.ecommerce.eorder.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wzg.ecommerce.common.utils.PageUtils;
import com.wzg.ecommerce.common.utils.Query;

import com.wzg.ecommerce.eorder.dao.OrderDao;
import com.wzg.ecommerce.eorder.entity.OrderEntity;
import com.wzg.ecommerce.eorder.service.OrderService;


@Service("orderService")
public class OrderServiceImpl extends ServiceImpl<OrderDao, OrderEntity> implements OrderService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderEntity> page = this.page(
                new Query<OrderEntity>().getPage(params),
                new QueryWrapper<OrderEntity>()
        );

        return new PageUtils(page);
    }

}