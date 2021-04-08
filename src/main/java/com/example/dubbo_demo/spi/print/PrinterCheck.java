package com.example.dubbo_demo.spi.print;

import org.apache.dubbo.common.URL;

public class PrinterCheck implements Printer {

    private Printer printer;

    public PrinterCheck(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(Class clazz, URL url) {
        System.out.println("before check");
        printer.print(clazz, url);
        System.out.println("after check");
    }
}
