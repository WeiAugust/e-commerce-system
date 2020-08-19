package com.wzg.ecommerce.eproducts;

import com.wzg.ecommerce.eproducts.entity.BrandEntity;
import com.wzg.ecommerce.eproducts.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EProductsApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("wzg");
        brandService.save(brandEntity);
    }

}
