package com.wzg.ecommerce.ecoupon.dao;

import com.wzg.ecommerce.ecoupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wzg
 * @email 285357487@qq.com
 * @date 2020-08-18 21:54:25
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
