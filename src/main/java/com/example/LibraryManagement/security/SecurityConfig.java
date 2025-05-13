package com.example.LibraryManagement.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())         // Disable CSRF
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll()         // Allow all requests without authentication
            );
        return http.build();
    }
}






