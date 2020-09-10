package com.wzg.ecommerce.eproducts.dao;

import com.wzg.ecommerce.eproducts.entity.BrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 品牌
 * 
 * @author wzg
 * @email 285357487@qq.com
 * @date 2020-08-18 20:21:25
 */
@Mapper
@Component
public interface BrandDao extends BaseMapper<BrandEntity> {
	
}
