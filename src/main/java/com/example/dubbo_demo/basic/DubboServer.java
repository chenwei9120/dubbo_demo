package com.example.dubbo_demo.basic;

import com.example.dubbo_demo.service.UserService;
import com.example.dubbo_demo.service.impl.UserServiceImpl;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;

import java.io.IOException;

public class DubboServer {

    public static void main(String[] args) throws IOException {
        ApplicationConfig applicationConfig = new ApplicationConfig("sample-server");
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(-1);
        RegistryConfig registryConfig =
                new RegistryConfig(RegistryConfig.NO_AVAILABLE);
        ServiceConfig serviceConfig  = new ServiceConfig();
        serviceConfig.setInterface(UserService.class);
        serviceConfig.setRef(new UserServiceImpl());

        serviceConfig.setRegistry(registryConfig);
        serviceConfig.setProtocol(protocolConfig);
        serviceConfig.setApplication(applicationConfig);
        serviceConfig.export();
        System.out.println("服务已暴露");
        System.in.read();
    }
}
