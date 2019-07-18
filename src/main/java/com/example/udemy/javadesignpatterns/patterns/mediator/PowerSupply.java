package com.example.udemy.javadesignpatterns.patterns.mediator;

public class PowerSupply {

    private boolean on;

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public boolean isOn() {
        return on;
    }
}
