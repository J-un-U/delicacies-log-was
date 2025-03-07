package com.example.delicacieslogwas.config; // 패키지 경로 확인!

import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // TODO Auto-generated method stub
        registry.addMapping("/**").allowedOrigins("*")
                .allowedMethods(CorsConfiguration.ALL).allowedHeaders(CorsConfiguration.ALL)
                .allowedOriginPatterns(CorsConfiguration.ALL);
    }


}