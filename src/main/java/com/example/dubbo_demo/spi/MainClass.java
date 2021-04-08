package com.example.dubbo_demo.spi;

import com.example.dubbo_demo.spi.print.Printer;
import com.example.dubbo_demo.spi.robot.Robot;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


public class MainClass {
    public static void main(String[] args) {
        ExtensionLoader<Robot> extensionLoader =
                ExtensionLoader.getExtensionLoader(Robot.class);
        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();

//        Robot bumblebee = extensionLoader.getExtension("bumblebee");
//        bumblebee.sayHello();

//        ExtensionLoader<Printer> extensionLoader =
//                ExtensionLoader.getExtensionLoader(Printer.class);
//        Printer printer = extensionLoader.getAdaptiveExtension();
////        printer.print(MainClass.class, URL.valueOf("test://localhost/test?printer=hpPrinter"));
////        Printer printer = extensionLoader.getAdaptiveExtension();
//        printer.print(MainClass.class, URL.valueOf("test://localhost/test"));
    }
}
