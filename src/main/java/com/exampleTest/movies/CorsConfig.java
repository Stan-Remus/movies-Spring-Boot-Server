package com.exampleTest.movies;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        System.out.println("CORS configuration applied");


        // Allow all endpoints under /api/v1/movies
        registry.addMapping("/api/v1/movies/**")
                .allowedOrigins("*")
                .allowedMethods("*");

        // Allow all endpoints under /api/v1/reviews
        registry.addMapping("/api/v1/reviews/**")
                .allowedOrigins("*")
                .allowedMethods("*");
    }
}
