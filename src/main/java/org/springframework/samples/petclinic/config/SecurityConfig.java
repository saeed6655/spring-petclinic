package org.springframework.samples.petclinic;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.context.annotation.Bean;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .anyRequest().authenticated() // يتطلب تسجيل الدخول لجميع الطلبات
            )
            .formLogin(); // يستخدم صفحة تسجيل الدخول الافتراضية
        return http.build();
    }
}
