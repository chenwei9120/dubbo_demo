package com.example.dubbo_demo.spi.aop;

import org.apache.dubbo.common.extension.SPI;

@SPI
public interface HelloService {

    void sayHello();
}
