package com.example.jenkins.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.core.convert.converter.Converter;

import java.util.Date;

@Configuration
@Order(1)
public class Converter2Configuration {

    @Bean

    public Converter<String, Date> stringDateConverter() {
        return new String2DateConverter();
    }
}
