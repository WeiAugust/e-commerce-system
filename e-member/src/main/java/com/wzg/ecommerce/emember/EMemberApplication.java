package com.wzg.ecommerce.emember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(EMemberApplication.class, args);
    }

}
