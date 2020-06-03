package com.example.dubbo_demo.util;

public class MyException extends Exception {
    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
