package com.atguigu.gmall.oms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author ZJJ
 * @date 2020/7/29 0029 上午 11:43
 */

@SpringBootApplication
@EnableFeignClients
@EnableSwagger2
@MapperScan("com.atguigu.gmall.oms.mapper")
public class GmallOmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallOmsApplication.class,args);
    }
}
