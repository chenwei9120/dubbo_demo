package com.example.dubbo_demo.service.impl;

import com.example.dubbo_demo.service.CountService;

import java.util.Random;

public class CountServiceImpl implements CountService {

    @Override
    public Integer getCount() throws InterruptedException {
        int sleeptime = 100;
        Thread.sleep(sleeptime);
        System.out.println("我运行过了:" + sleeptime);
        return sleeptime;
    }
}
