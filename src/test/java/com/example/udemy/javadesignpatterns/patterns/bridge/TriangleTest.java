package com.example.udemy.javadesignpatterns.patterns.bridge;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void verifyTriangleWithRedColor() {
        Shape triangle = new Triangle(new Red());

        assertEquals("Drawn Triangle: filled Red", triangle.draw());
    }

    @Test
    public void verifyTriangleWithBlueColor() {
        Shape triangle = new Triangle(new Blue());

        assertEquals("Drawn Triangle: filled Blue", triangle.draw());
    }

}