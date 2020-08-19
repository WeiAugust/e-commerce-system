package com.wzg.ecommerce.emember.dao;

import com.wzg.ecommerce.emember.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author wzg
 * @email 285357487@qq.com
 * @date 2020-08-18 22:03:58
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
