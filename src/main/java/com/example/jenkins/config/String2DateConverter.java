package com.example.jenkins.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class String2DateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String source) {

        String FORMAT = "yyyy-MM-dd HH:mm:ss";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(FORMAT);

        Date date = null;

        if (source.contains(":") || source.contains("-")){
            try {
                date = simpleDateFormat.parse(source);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return date;
        }

        date = new Date(Long.parseLong(source));

        return date;
    }
}
