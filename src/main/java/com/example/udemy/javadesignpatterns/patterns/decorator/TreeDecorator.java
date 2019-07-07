package com.example.udemy.javadesignpatterns.patterns.decorator;

public abstract class TreeDecorator implements ChristmasTree {

    private ChristmasTree christmasTree;

    public TreeDecorator(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    public String decorate() {
        return christmasTree.decorate();
    }
}
