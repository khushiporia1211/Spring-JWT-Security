package com.springSecurity.SpringSecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration 
@EnableWebSecurity 
public class SecurityConfig {

   @Bean 
    public org.springframework.security.web.SecurityFilterChain SecurityFilterChain(HttpSecurity http) throws Exception{
        http.csrf(customiser -> customiser.disable());
        http.authorizeHttpRequests(request -> request.anyRequest().authenticated());
        return http.build();
    }

}
