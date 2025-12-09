package com.myfinbank.admin.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@RequiredArgsConstructor
public class AdminSecurityConfig {

    private final AdminJwtAuthFilter adminJwtAuthFilter;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.csrf(csrf -> csrf.disable());

        http.authorizeHttpRequests(auth -> auth

                // Admin UI (session)
                .requestMatchers("/admin/login", "/admin/register", "/admin/logout").permitAll()
                .requestMatchers("/admin/**").permitAll()   

                // static
                .requestMatchers("/css/**", "/js/**", "/images/**").permitAll()

                // Public token API for admin (Postman / other services)
                .requestMatchers("/api/admin/auth/token").permitAll()

                // Protect admin APIs (REST) with JWT
                .requestMatchers("/api/admin/**").authenticated()

                .anyRequest().permitAll()
        );

        // apply JWT filter to /api/**
        http.addFilterBefore(adminJwtAuthFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
}
