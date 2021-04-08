package com.example.dubbo_demo.spi.aop;

import org.apache.dubbo.common.extension.ExtensionLoader;

public class MainClass {

    public static void main(String[] args) {
        ExtensionLoader<HelloService> loader = ExtensionLoader.getExtensionLoader(HelloService.class);
        HelloService helloService = loader.getExtension("helloServiceImpl");
        helloService.sayHello();
    }
}
