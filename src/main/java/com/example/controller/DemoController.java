package com.example.controller;

import com.example.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @Autowired
    DemoService demoService;
    // Annotation
    @ResponseBody
    @RequestMapping("/hello")

    // Method
    public String helloWorld() {
        return "Hello World!";
    }
    public DemoController() {
        System.out.println("DemoController Constructor");
    }
}
