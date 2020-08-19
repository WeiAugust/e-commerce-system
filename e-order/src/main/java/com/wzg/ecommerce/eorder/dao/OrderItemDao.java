package com.wzg.ecommerce.eorder.dao;

import com.wzg.ecommerce.eorder.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author wzg
 * @email 285357487@qq.com
 * @date 2020-08-18 22:07:46
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
