package com.example.udemy.javadesignpatterns.patterns.adapter;

import org.junit.Test;

import static org.junit.Assert.*;

public class AmericanEuropeanAdapterTest {

    @Test
    public void verifySpeedConvertedToKpH() {
        AmericanCar ford = new Ford(200);
        EuropeanCar europeanCar = new AmericanEuropeanAdapter(ford);

        assertEquals(320, europeanCar.getSpeed(), 0.1);
    }

}