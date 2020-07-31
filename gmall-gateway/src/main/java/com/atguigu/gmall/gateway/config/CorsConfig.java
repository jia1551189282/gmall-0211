package com.atguigu.gmall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * @author ZJJ
 * @date 2020/7/30 0030 上午 9:31
 */

@Configuration
public class CorsConfig {

    @Bean
    public CorsWebFilter corsWebFilter(){
        CorsConfiguration config = new CorsConfiguration();

        // 允许的域,不要写*，否则cookie就无法使用了
        config.addAllowedOrigin("http://manager.gmall.com");/*
        config.addAllowedOrigin("http://www.gmall.com");
        config.addAllowedOrigin("api.gmall.com");*/
        config.addAllowedOrigin("*");
        // 允许的请求头
        config.addAllowedHeader("*");
        // 允许的请方法
        config.addAllowedMethod("*");
        //允许cookie
        config.setAllowCredentials(true);

        // 添加映射路径，我们拦截一切请求
        UrlBasedCorsConfigurationSource corsConfigurationSource = new UrlBasedCorsConfigurationSource();
        corsConfigurationSource.registerCorsConfiguration("/**", config);

        return new CorsWebFilter(corsConfigurationSource);

    }
}
