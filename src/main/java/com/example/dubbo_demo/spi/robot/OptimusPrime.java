package com.example.dubbo_demo.spi.robot;

import com.example.dubbo_demo.spi.print.Printer;
import org.apache.dubbo.common.URL;

public class OptimusPrime implements Robot {

    private Printer printer;

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void sayHello() {
        printer.print(this.getClass(), URL.valueOf("test://localhost/test?p=hpPrinter"));
    }
}
