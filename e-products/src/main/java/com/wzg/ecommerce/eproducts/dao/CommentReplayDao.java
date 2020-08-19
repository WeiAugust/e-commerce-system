package com.wzg.ecommerce.eproducts.dao;

import com.wzg.ecommerce.eproducts.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author wzg
 * @email 285357487@qq.com
 * @date 2020-08-18 20:21:24
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
