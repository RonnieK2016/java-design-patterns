package com.example.udemy.javadesignpatterns.patterns.flyweight;

import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleFactoryTest {

    @Test
    public void verifyCarIsCreatedOnlyOnePerColor() {
        Vehicle vehicle = VehicleFactory.getCarModel(CarColor.BLACK);

        Vehicle vehicle2 = VehicleFactory.getCarModel(CarColor.BLACK);

        assertEquals(vehicle, vehicle2);
    }

    @Test
    public void verifyDifferentCarsCreatedForDifferentColors() {
        Vehicle vehicle = VehicleFactory.getCarModel(CarColor.BLACK);

        Vehicle vehicle2 = VehicleFactory.getCarModel(CarColor.RED);

        assertNotEquals(vehicle, vehicle2);
    }

}