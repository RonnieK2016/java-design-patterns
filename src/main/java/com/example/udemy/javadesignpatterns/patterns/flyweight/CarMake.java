package com.example.udemy.javadesignpatterns.patterns.flyweight;

import java.util.Objects;

public class CarMake implements Vehicle {

    private CarColor color;
    private Engine engine;

    public CarMake(CarColor color, Engine engine) {
        this.engine = engine;
        this.color = color;
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public CarColor getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarMake carMake = (CarMake) o;
        return Objects.equals(engine, carMake.engine) &&
                color == carMake.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, color);
    }
}
