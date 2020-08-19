package com.wzg.ecommerce.eorder.dao;

import com.wzg.ecommerce.eorder.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wzg
 * @email 285357487@qq.com
 * @date 2020-08-18 22:07:46
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
