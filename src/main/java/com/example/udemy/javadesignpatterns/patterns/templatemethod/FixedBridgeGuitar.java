package com.example.udemy.javadesignpatterns.patterns.templatemethod;

public class FixedBridgeGuitar extends Guitar {

    @Override
    protected void buildNeck() {
        System.out.println("Building Neck For Fixed Bridge");
    }

    @Override
    protected void buildBody() {
        System.out.println("Building Body For Fixed Bridge");
    }

    @Override
    protected void buildBridge() {
        System.out.println("Building Fixed Bridge");
    }

    @Override
    protected void buildPickups() {
        System.out.println("Building Pickups");
    }
}
