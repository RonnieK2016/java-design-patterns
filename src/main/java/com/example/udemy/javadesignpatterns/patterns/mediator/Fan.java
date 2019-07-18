package com.example.udemy.javadesignpatterns.patterns.mediator;

public class Fan {

    private boolean isOn;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }
}
