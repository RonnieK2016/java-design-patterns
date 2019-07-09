package com.example.udemy.javadesignpatterns.patterns.proxy;

public class RealInternet implements Internet {


    @Override
    public boolean connectTo(String site) {
        return true;
    }
}
