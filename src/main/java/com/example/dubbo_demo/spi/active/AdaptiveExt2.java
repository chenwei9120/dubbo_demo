package com.example.dubbo_demo.spi.active;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI("dubbo")
public interface AdaptiveExt2 {
    @Adaptive
    String echo(String msg, URL url);
}
