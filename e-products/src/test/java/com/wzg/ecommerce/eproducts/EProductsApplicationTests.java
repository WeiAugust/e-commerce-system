package com.wzg.ecommerce.eproducts;


import com.wzg.ecommerce.eproducts.entity.BrandEntity;
import com.wzg.ecommerce.eproducts.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class EProductsApplicationTests {

    @Autowired
    BrandService brandService;


//    @Test
//    void testUpload() throws FileNotFoundException {
//        // Endpoint以杭州为例，其它Region请按实际情况填写。
//        String endpoint = "http://oss-cn-shanghai.aliyuncs.com";
//        // 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
//        String accessKeyId = "LTAI4G27dBopepUXHtTQeuoc";
//        String accessKeySecret = "755babXh0PfSfGrbpaFy6QKihvTUKK";
//
//        // 创建OSSClient实例。
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//        // 上传文件流。
//        InputStream inputStream = new FileInputStream("C:\\Users\\weiau\\Downloads\\b8ed270cdde48892aec1890d1451b782.jpg");
//        ossClient.putObject("e-commerce-wzg", "test", inputStream);
//
//        // 关闭OSSClient。
//        ossClient.shutdown();
//        System.out.println("success");
//    }
//    @Test
//    void contextLoads() {
//
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("wzg");
//        brandService.save(brandEntity);
//    }

}
