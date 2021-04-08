package com.example.dubbo_demo.spi.print;

import org.apache.dubbo.common.URL;

public class PrinterLogWrapper implements Printer {

    private Printer printer;

    public PrinterLogWrapper(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(Class clazz, URL url) {
        System.out.println("before print");
        printer.print(clazz, url);
        System.out.println("after print");
    }
}
