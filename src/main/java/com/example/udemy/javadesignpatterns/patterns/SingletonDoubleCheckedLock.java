package com.example.udemy.javadesignpatterns.patterns;

import java.util.concurrent.atomic.AtomicInteger;

public class SingletonDoubleCheckedLock {

    private AtomicInteger counter = new AtomicInteger();

    private static SingletonDoubleCheckedLock instance;

    protected SingletonDoubleCheckedLock() {}

    public static SingletonDoubleCheckedLock getInstance() {
        if(instance == null) {
            synchronized(SingletonDoubleCheckedLock.class) {
                if(instance == null) {
                    instance = new SingletonDoubleCheckedLock();
                }
            }
        }

        return instance;
    }

    public void increment() {
        counter.incrementAndGet();
    }

    public int getCounter() {
        return counter.get();
    }
}
