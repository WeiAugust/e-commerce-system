package com.wzg.ecommerce.emember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wzg.ecommerce.common.utils.PageUtils;
import com.wzg.ecommerce.emember.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author wzg
 * @email 285357487@qq.com
 * @date 2020-08-18 22:03:58
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

