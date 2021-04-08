package com.example.dubbo_demo.basic;

import com.example.dubbo_demo.service.UserService;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;

public class DubboClient {
    public static void main(String[] args) {
        ApplicationConfig applicationConfig = new ApplicationConfig("sample-client");
        ReferenceConfig referenceConfig = new ReferenceConfig<>();
        referenceConfig.setApplication(applicationConfig);
        referenceConfig.setInterface(UserService.class);
        referenceConfig.setUrl("dubbo://192.168.1.2:20880/com.example.dubbo_demo.service.UserService");

        UserService userService = (UserService) referenceConfig.get();
        System.out.println(userService.getUserById(1));
    }
}
