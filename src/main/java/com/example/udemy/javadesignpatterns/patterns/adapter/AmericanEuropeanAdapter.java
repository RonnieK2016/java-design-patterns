package com.example.udemy.javadesignpatterns.patterns.adapter;

public class AmericanEuropeanAdapter implements EuropeanCar {

    private AmericanCar americanCar;

    public AmericanEuropeanAdapter(AmericanCar americanCar) {
        this.americanCar = americanCar;
    }

    @Override
    public double getSpeed() {
        return americanCar.getSpeed() * 1.6;
    }
}
