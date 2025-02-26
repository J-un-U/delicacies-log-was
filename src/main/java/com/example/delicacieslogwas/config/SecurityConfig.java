package com.example.delicacieslogwas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .cors(Customizer.withDefaults())
                // 만약 회원가입 엔드포인트에만 CSRF 검증을 비활성화하고 싶다면 아래처럼 설정:
                .csrf(csrf -> csrf
                        .ignoringRequestMatchers("/user/join")
                )
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers(HttpMethod.OPTIONS, "/**").permitAll() // preflight 요청 허용
                        .requestMatchers("/user/join").permitAll()  // 회원가입은 인증 없이 접근 허용
                        .anyRequest().authenticated()
                )
                .formLogin(Customizer.withDefaults())  // 기본 로그인 페이지 사용
                .logout(logout -> logout.permitAll());

        return http.build();
    }
}
