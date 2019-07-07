package com.example.udemy.javadesignpatterns.patterns.bridge;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Drawn Triangle:" + color.fill();
    }
}
