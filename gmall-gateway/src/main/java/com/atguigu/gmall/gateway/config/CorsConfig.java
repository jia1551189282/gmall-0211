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
        config.addAllowedOrigin("http://localhost:8000");
        config.addAllowedOrigin("http://localhost:18080");
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
