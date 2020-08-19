package com.wzg.ecommerce.eproducts.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wzg.ecommerce.common.utils.PageUtils;
import com.wzg.ecommerce.eproducts.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author wzg
 * @email 285357487@qq.com
 * @date 2020-08-18 20:21:25
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

