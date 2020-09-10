package com.wzg.ecommerce.eproducts;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.wzg.ecommerce.eproducts.dao")
@ComponentScan
public class EProductsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EProductsApplication.class, args);
    }

}
