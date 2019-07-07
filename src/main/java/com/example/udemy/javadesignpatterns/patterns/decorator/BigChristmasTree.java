package com.example.udemy.javadesignpatterns.patterns.decorator;

public class BigChristmasTree implements ChristmasTree {

    @Override
    public String decorate() {
        return "This is a big Christmas tree";
    }
}
