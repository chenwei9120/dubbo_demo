package com.example.dubbo_demo.spi.aop;

public class HelloServiceWrapper implements HelloService {

    private HelloService helloService;

    public HelloServiceWrapper(HelloService helloService) {
        this.helloService = helloService;
    }

    @Override
    public void sayHello() {
        System.out.println("wrapper begin");
        this.helloService.sayHello();
        System.out.println("wrapper end");
    }
}
