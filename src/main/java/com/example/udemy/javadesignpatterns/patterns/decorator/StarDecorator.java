package com.example.udemy.javadesignpatterns.patterns.decorator;

public class StarDecorator extends TreeDecorator {

    public StarDecorator(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    private String starDecorator() {
        return  " with Star";
    }

    @Override
    public String decorate() {
        return super.decorate() + starDecorator();
    }
}
