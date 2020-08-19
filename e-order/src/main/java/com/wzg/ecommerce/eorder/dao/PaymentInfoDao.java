package com.wzg.ecommerce.eorder.dao;

import com.wzg.ecommerce.eorder.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author wzg
 * @email 285357487@qq.com
 * @date 2020-08-18 22:07:46
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
