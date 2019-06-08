package com.hxz.example.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hxz.example.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @GetMapping("/sayHello")
    public String sayHello(@RequestParam(defaultValue = "hxz") String name) {
        System.out.println("i'm ready to call someone......");

        return helloService.sayHello(name);
    }

}
