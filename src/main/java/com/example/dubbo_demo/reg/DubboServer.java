package com.example.dubbo_demo.reg;

import com.example.dubbo_demo.service.UserService;
import com.example.dubbo_demo.service.impl.UserServiceImpl;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;

import java.io.IOException;

public class DubboServer {

    public static void main(String[] args) throws IOException {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(-1);

        ServiceConfig<UserService> serviceConfig  = new ServiceConfig<>();
        serviceConfig.setInterface(UserService.class);
        serviceConfig.setRef(new UserServiceImpl());

        ApplicationConfig applicationConfig = new ApplicationConfig("sample-server");
        RegistryConfig registryConfig = new RegistryConfig("multicast://224.1.1.1:3333");
//        RegistryConfig registryConfig = new RegistryConfig("zookeeper://192.168.1.2:2181");

        serviceConfig.setRegistry(registryConfig);
        serviceConfig.setProtocol(protocolConfig);
        serviceConfig.setApplication(applicationConfig);
        serviceConfig.export();
        System.out.println("服务已暴露");
        System.in.read();
    }
}