package com.example.udemy.javadesignpatterns.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

    private static Map<CarColor, Vehicle> CACHE = new HashMap<>();

    public static Vehicle getCarModel(CarColor color) {
        Vehicle vehicle = CACHE.computeIfAbsent(color, newColor -> {
            Engine engine = new Engine(200);
            return new CarMake(newColor, engine);
        });

        return vehicle;
    }

}
