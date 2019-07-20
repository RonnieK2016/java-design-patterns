package com.example.udemy.javadesignpatterns.patterns.templatemethod;

import org.junit.Test;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class FixedBridgeGuitarTest {

    @Test
    public void verifyFixedBridgeGuitarIsbBuilt() {
        Guitar guitar = spy(new FixedBridgeGuitar());

        guitar = guitar.buildGuitar();

        verify(guitar).buildNeck();
        verify(guitar).buildBody();
        verify(guitar).buildPickups();
        verify(guitar).buildBridge();
    }
}