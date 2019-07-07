package com.example.udemy.javadesignpatterns.patterns.decorator;

public class TinselDecorator extends TreeDecorator {

    public TinselDecorator(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    private String tinselDecorator() {
        return  " with Tinsel";
    }

    @Override
    public String decorate() {
        return super.decorate() + tinselDecorator();
    }
}
