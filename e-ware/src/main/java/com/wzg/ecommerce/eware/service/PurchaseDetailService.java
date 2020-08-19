package com.wzg.ecommerce.eware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wzg.ecommerce.common.utils.PageUtils;
import com.wzg.ecommerce.eware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author wzg
 * @email 285357487@qq.com
 * @date 2020-08-18 22:10:45
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

