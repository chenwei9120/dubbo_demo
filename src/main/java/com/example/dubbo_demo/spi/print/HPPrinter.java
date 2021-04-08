package com.example.dubbo_demo.spi.print;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;

//@Adaptive
public class HPPrinter implements Printer {

    @Override
    public void print(Class clazz, URL url) {
        System.out.println(clazz.getSimpleName() + " print with hp");
    }
}
