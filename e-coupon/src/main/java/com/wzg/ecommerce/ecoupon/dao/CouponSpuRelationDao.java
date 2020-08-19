package com.wzg.ecommerce.ecoupon.dao;

import com.wzg.ecommerce.ecoupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author wzg
 * @email 285357487@qq.com
 * @date 2020-08-18 21:54:25
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
