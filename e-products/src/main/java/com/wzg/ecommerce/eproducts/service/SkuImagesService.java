package com.wzg.ecommerce.eproducts.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wzg.ecommerce.common.utils.PageUtils;
import com.wzg.ecommerce.eproducts.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author wzg
 * @email 285357487@qq.com
 * @date 2020-08-18 20:21:24
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

