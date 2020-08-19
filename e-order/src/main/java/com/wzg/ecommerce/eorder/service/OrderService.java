package com.wzg.ecommerce.eorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wzg.ecommerce.common.utils.PageUtils;
import com.wzg.ecommerce.eorder.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author wzg
 * @email 285357487@qq.com
 * @date 2020-08-18 22:07:46
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

