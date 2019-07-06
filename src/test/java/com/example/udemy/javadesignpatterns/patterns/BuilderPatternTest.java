package com.example.udemy.javadesignpatterns.patterns;

import org.junit.Test;

import static org.junit.Assert.*;

public class BuilderPatternTest {

    @Test
    public void testBuilder() {
        Long id = 1L;
        String firstName = "TEST_FIRST_NAME";
        String lastName = "TEST_LAST_NAME";
        String address = "TEST_ADDRESS";

        BuilderPattern builderPattern = BuilderPattern.builder().id(id).firstName(firstName)
                .lastName(lastName).address(address).build();

        assertEquals(id, builderPattern.getId());
        assertEquals(firstName, builderPattern.getFirstName());
        assertEquals(lastName, builderPattern.getLastName());
        assertEquals(lastName, builderPattern.getLastName());
        assertEquals(address, builderPattern.getAddress());
    }
}