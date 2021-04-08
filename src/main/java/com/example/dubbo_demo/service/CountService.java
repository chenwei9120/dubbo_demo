package com.example.dubbo_demo.service;

import java.util.concurrent.CompletableFuture;

public interface CountService {

    Integer getCount() throws InterruptedException;

    default CompletableFuture<Integer> getCount(Long status) throws InterruptedException {
        return CompletableFuture.completedFuture(getCount());
    }

}
