package com.wzg.ecommerce.eproducts.dao;

import com.wzg.ecommerce.eproducts.entity.AttrAttrgroupRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 属性&属性分组关联
 * 
 * @author wzg
 * @email 285357487@qq.com
 * @date 2020-08-18 20:21:25
 */
@Mapper
@Component
public interface AttrAttrgroupRelationDao extends BaseMapper<AttrAttrgroupRelationEntity> {
	
}
