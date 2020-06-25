package com.pengli.configs;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class MyConfig {
    @Bean
    public String get() {
        return "asdf";
    }
}
