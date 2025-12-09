package com.myfinbank.customer.security;



import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@RequiredArgsConstructor
public class SecurityConfig {

    private final JwtAuthFilter jwtAuthFilter;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.csrf(csrf -> csrf.disable());

        http.authorizeHttpRequests(auth -> auth

                // --- PUBLIC UI PAGES ---
                .requestMatchers("/login", "/auth/login", "/register", "/logout").permitAll()
                .requestMatchers("/css/**", "/js/**", "/images/**").permitAll()
                .requestMatchers("/dashboard", "/deposit", "/withdraw",
                                 "/transfer", "/apply-loan",
                                 "/calculate-emi", "/get-token",
                                 "/loan/**").permitAll()

                // --- PUBLIC TOKEN API ---
                .requestMatchers("/api/auth/token").permitAll()

                // --- IMPORTANT: ALLOW ADMIN → CUSTOMER API BEFORE /api/** ---
                .requestMatchers("/api/customers/**").permitAll()

                // --- ALL OTHER /api/ NEED JWT (for mobile app or Postman) ---
                .requestMatchers("/api/**").authenticated()

                .anyRequest().permitAll()
        );

        http.addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
}
