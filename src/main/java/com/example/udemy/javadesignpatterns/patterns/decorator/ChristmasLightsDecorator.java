package com.example.udemy.javadesignpatterns.patterns.decorator;

public class ChristmasLightsDecorator extends TreeDecorator {

    public ChristmasLightsDecorator(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    private String lightsDecorator() {
        return  " with Christmas Lights";
    }

    @Override
    public String decorate() {
        return super.decorate() + lightsDecorator();
    }
}
