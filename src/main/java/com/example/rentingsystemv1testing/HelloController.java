package com.example.rentingsystemv1testing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class HelloController {

    @GetMapping("/get")
    public String getHellow(){
        return "hello feras";
    }



}
