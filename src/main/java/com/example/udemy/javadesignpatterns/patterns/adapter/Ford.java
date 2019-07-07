package com.example.udemy.javadesignpatterns.patterns.adapter;

public class Ford implements AmericanCar {

    private double speed;

    public Ford(double speed) {
        this.speed = speed;
    }

    @Override
    public double getSpeed() {
        return speed;
    }
}
