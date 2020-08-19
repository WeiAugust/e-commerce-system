package com.wzg.ecommerce.emember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wzg.ecommerce.common.utils.PageUtils;
import com.wzg.ecommerce.emember.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author wzg
 * @email 285357487@qq.com
 * @date 2020-08-18 22:03:58
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

