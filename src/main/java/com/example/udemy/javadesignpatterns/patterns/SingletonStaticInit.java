package com.example.udemy.javadesignpatterns.patterns;

import java.util.concurrent.atomic.AtomicInteger;

public class SingletonStaticInit {

    static class SingletonInstanceHolder {
        private static final SingletonStaticInit INSTANCE = new SingletonStaticInit();
    }

    private AtomicInteger counter = new AtomicInteger();

    public static SingletonStaticInit getInstance() {
        return SingletonInstanceHolder.INSTANCE;
    }

    public void increment() {
        counter.incrementAndGet();
    }

    public int getCounter() {
        return counter.get();
    }

}
