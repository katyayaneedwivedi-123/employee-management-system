package com.example.employee_management.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable() // Disable CSRF protection for development (not recommended for production)
            .authorizeRequests()
                .anyRequest().permitAll() // Allow all requests without authentication
            .and()
            .formLogin().disable(); // Disable form login if you are handling login on the frontend (optional)

        return http.build();
    }
}