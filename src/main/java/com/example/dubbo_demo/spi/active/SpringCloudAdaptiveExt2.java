package com.example.dubbo_demo.spi.active;

import org.apache.dubbo.common.URL;

public class SpringCloudAdaptiveExt2 implements AdaptiveExt2 {

    @Override
    public String echo(String msg, URL url) {
        return "spring cloud";
    }
}