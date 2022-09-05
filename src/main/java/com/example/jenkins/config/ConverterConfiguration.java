package com.example.jenkins.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.core.convert.converter.Converter;

import java.util.Date;

@Configuration
@Order(2)
public class ConverterConfiguration {


    @Bean
    public Converter<String, Date> stringDate2Converter() {
        return new String22DateConverter();
    }
}
