package com.example.dubbo_demo.spi.robot;

import com.example.dubbo_demo.spi.print.Printer;
import org.apache.dubbo.common.URL;

public class Bumblebee implements Robot {

    private Printer printer;

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void sayHello() {
        //URL url = URL.valueOf("test://localhost/test?name=way&adaptive.ext2=cloud");
        printer.print(this.getClass(), URL.valueOf("test://localhost/test?printer=hpPrinter"));
        //System.out.println("Hello, I am Optimus Prime.");
    }


}
