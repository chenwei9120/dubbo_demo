package com.example.dubbo_demo.spi.active;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;

//@Adaptive
public class ThriftAdaptiveExt2 implements AdaptiveExt2 {

    @Override
    @Adaptive({"t"})
    public String echo(String msg, URL url) {
        return "thrift";
    }
}
