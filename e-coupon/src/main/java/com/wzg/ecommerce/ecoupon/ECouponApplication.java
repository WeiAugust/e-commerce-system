package com.wzg.ecommerce.ecoupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ECouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(ECouponApplication.class, args);
    }

}
