package com.wzg.ecommerce.ecoupon.controller;

import com.wzg.ecommerce.common.utils.R;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Test
 * @Description TODO
 * @Author wzg
 * @Date 2020/8/19 16:12
 * @Version 1.0
 **/

@RefreshScope
@RequestMapping("coupon/test")
@RestController
public class Test {

    @Value("${coupon.user.name}")
    private String name;
    @Value("${coupon.user.age}")
    private Integer age;

    @RequestMapping("/dynConfig")
    public R test(){
        return R.ok().put("name", name).put("age", age);
    }
}
