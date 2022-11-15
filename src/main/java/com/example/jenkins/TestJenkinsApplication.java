package com.example.jenkins;

import org.springframework.boot.Banner;
import org.springframework.boot.ImageBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.PathResource;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TestJenkinsApplication {

    public static void main(String[] args) {
        //SpringApplication.run(TestJenkinsApplication.class, args);

        SpringApplication app = new SpringApplication(TestJenkinsApplication.class);

        List<String> strings = new ArrayList<>();

    }
}
