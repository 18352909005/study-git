package com.example.jenkins.controller;

import com.example.jenkins.vo.TestReqVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class FirstController {

    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping("/index")
    public String index(Map<String, Object> map){


        map.put("name","Jenkins");

        return "index";
    }

    @GetMapping("/testConverter")
    @ResponseBody
    public String textConverter(TestReqVo testReqVo){

        System.out.println(testReqVo.toString());

        return testReqVo.toString();
    }

}
