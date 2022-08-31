package com.example.jenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class FirstController {

    @GetMapping("/index")
    public String index(Map<String, Object> map){

        map.put("name","Jenkins");

        return "index";
    }

}
