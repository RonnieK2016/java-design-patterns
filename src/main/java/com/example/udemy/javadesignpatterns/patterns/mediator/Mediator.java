package com.example.udemy.javadesignpatterns.patterns.mediator;

public class Mediator {

    private Fan fan;
    private PowerSupply powerSupply;

    public Mediator(Fan fan, PowerSupply powerSupply) {
        this.fan = fan;
        this.powerSupply = powerSupply;
    }

    public void press() {
        if (fan.isOn()) {
            stop();
            fan.turnOff();
        } else {
            start();
            fan.turnOn();
        }
    }

    public void start() {
        powerSupply.turnOn();
    }

    public void stop() {
        powerSupply.turnOff();
    }
}
