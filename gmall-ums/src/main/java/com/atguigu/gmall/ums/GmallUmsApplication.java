package com.atguigu.gmall.ums;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author ZJJ
 * @date 2020/7/29 0029 下午 2:57
 */

@SpringBootApplication
@EnableSwagger2
@EnableFeignClients
@MapperScan("com.atguigu.gmall.ums.mapper")
public class GmallUmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(GmallUmsApplication.class,args);
    }
}
