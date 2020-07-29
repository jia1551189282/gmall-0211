package com.atguigu.gmall.sms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author ZJJ
 * @date 2020/7/29 0029 下午 2:55
 */

@SpringBootApplication
@EnableFeignClients
@EnableSwagger2
@MapperScan("com.atguigu.gmall.sms.mapper")
public class GmallSmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(GmallSmsApplication.class,args);
    }
}
