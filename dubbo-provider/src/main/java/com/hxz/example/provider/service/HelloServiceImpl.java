package com.hxz.example.provider.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.hxz.example.service.HelloService;
import org.springframework.stereotype.Component;

@Component
@Service
public class HelloServiceImpl implements HelloService {

    public String sayHello(String name) {
        System.out.println("========================duboo provider HelloServiceImpl sayHello name="+name);
        return "Hello " + name;
    }
}
