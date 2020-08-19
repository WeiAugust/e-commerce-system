package com.wzg.ecommerce.ecoupon.dao;

import com.wzg.ecommerce.ecoupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author wzg
 * @email 285357487@qq.com
 * @date 2020-08-18 21:54:25
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
