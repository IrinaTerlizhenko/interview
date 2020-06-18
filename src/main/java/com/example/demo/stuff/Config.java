package com.example.demo.stuff;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public AnotherObject someObject() {
        return new AnotherObject();
    }
}
