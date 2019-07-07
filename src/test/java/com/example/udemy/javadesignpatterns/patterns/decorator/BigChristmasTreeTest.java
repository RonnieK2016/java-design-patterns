package com.example.udemy.javadesignpatterns.patterns.decorator;

import org.junit.Test;

import static org.junit.Assert.*;

public class BigChristmasTreeTest {

    @Test
    public void verifyTreeDecoratedWithLightsTinselAndStar() {
        ChristmasTree bigChristmasTree = new BigChristmasTree();
        TreeDecorator treeDecorator = new StarDecorator(
                new TinselDecorator(new ChristmasLightsDecorator(bigChristmasTree))
        );

        assertEquals("This is a big Christmas tree with Christmas Lights with Tinsel with Star",
                treeDecorator.decorate());
    }

    @Test
    public void verifyTreeDecoratedWithTinselAndStar() {
        ChristmasTree bigChristmasTree = new BigChristmasTree();
        TreeDecorator treeDecorator = new StarDecorator(
                new TinselDecorator(bigChristmasTree)
        );

        assertEquals("This is a big Christmas tree with Tinsel with Star",
                treeDecorator.decorate());
    }
}