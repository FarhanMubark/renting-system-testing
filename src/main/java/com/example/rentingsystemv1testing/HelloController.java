package com.example.rentingsystemv1testing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class HelloController {

    @GetMapping("/get")
    public String getHellow(){


        return "hello farhan 123";
    }

    @GetMapping("/get/welcome")
    public String getWelcome(){
        return "Welcome farhan";

    }

    @GetMapping("/get/welcome/v2")
    public String get2(){
        return "Welcome farhan azoz feras";

    }


}
