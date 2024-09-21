package com.example.springbooot;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration

public class WebConfig implements WebMvcConfigurer {
// 커스터마이징된 설정 추가
    
@Override
public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")  // 특정 경로에 CORS 허용
            .allowedOrigins("https://localhost:3000", "http://127.0.0.1:5500/")  // 허용할 도메인
            .allowedMethods("GET", "POST", "PUT", "DELETE")  // 허용할 HTTP 메서드
            .allowedMethods("*")
            .allowCredentials(true);  // 인증 정보 허용
}
}
