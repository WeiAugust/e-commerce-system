package com.wzg.ecommerce.ecoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wzg.ecommerce.common.utils.PageUtils;
import com.wzg.ecommerce.ecoupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author wzg
 * @email 285357487@qq.com
 * @date 2020-08-18 21:54:25
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

