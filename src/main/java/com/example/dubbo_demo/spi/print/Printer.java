package com.example.dubbo_demo.spi.print;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI("canonPrinter")
public interface Printer {
    @Adaptive({"p"})
    void print(Class clazz, URL url);
}
