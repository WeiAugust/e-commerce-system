package com.wzg.ecommerce.ecoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wzg.ecommerce.common.utils.PageUtils;
import com.wzg.ecommerce.ecoupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author wzg
 * @email 285357487@qq.com
 * @date 2020-08-18 21:54:25
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

