package com.example.dubbo_demo.reg;

import com.example.dubbo_demo.model.User;
import com.example.dubbo_demo.service.UserService;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DubboClient {
    public static void main(String[] args) throws IOException {
        ApplicationConfig applicationConfig = new ApplicationConfig("sample-client");
        RegistryConfig registryConfig = new RegistryConfig("multicast://224.1.1.1:3333");
//        RegistryConfig registryConfig = new RegistryConfig("zookeeper://192.168.1.2:2181");
        ReferenceConfig referenceConfig = new ReferenceConfig<>();
        referenceConfig.setLoadbalance("roundrobin");
        referenceConfig.setRegistry(registryConfig);
        referenceConfig.setApplication(applicationConfig);
        referenceConfig.setInterface(UserService.class);
        //referenceConfig.setUrl("dubbo://192.168.1.2:20880/com.example.dubbo_demo.service.UserService");

        UserService userService = null;
        try {
            userService = (UserService) referenceConfig.get();
        } catch (Exception e) {
            e.printStackTrace();
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = bufferedReader.readLine();
            if (line.equals("quit")) {
                break;
            }
            User user = userService.getUserById(Integer.valueOf(line));
            System.out.println(user);
        }
    }
}
