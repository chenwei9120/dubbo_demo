package com.example.dubbo_demo.service.impl;

import com.example.dubbo_demo.service.HelloService;

public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
