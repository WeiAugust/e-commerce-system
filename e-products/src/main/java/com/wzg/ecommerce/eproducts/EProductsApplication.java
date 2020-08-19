package com.wzg.ecommerce.eproducts;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wzg.ecommerce.eproducts.dao")
public class EProductsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EProductsApplication.class, args);
    }

}
