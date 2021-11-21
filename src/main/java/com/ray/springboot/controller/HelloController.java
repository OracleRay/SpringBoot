package com.ray.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                     //相当于@Controller + @ResponseBondy,可以返回json格式
public class HelloController {
    @RequestMapping("/hello")
    public String helo(){
        return "hello springboot!";
    }
}
