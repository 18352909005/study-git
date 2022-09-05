package com.example.jenkins.compont;

import org.springframework.boot.Banner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.io.PrintStream;

@Component
public class bannerTest implements Banner {
    /**
     * Print the banner to the specified print stream.
     *
     * @param environment the spring environment
     * @param sourceClass the source class for the application
     * @param out         the output print stream
     */
    @Override
    public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {

        System.out.println(1);
    }
}
