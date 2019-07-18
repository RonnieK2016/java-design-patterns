package com.example.udemy.javadesignpatterns.patterns.mediator;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ButtonTest {

    @Test
    public void pressingButtonTurnsOnFanAndPowerSupply() {
        PowerSupply powerSupply = spy(new PowerSupply());
        Fan fan = spy(new Fan());
        Mediator mediator = spy(new Mediator(fan, powerSupply));
        Button button = new Button(mediator);

        button.press();

        verify(fan).turnOn();
        verify(powerSupply).turnOn();
        verify(mediator).start();
        verify(mediator).press();
        assertTrue(fan.isOn());
        assertTrue(powerSupply.isOn());
    }

    @Test
    public void pressingButtonSecondTimeTurnsOffFanAndPowerSupply() {
        PowerSupply powerSupply = spy(new PowerSupply());
        Fan fan = spy(new Fan());
        Mediator mediator = spy(new Mediator(fan, powerSupply));
        Button button = new Button(mediator);

        button.press();

        button.press();

        verify(fan).turnOn();
        verify(fan).turnOff();
        verify(powerSupply).turnOn();
        verify(powerSupply).turnOff();
        verify(mediator).start();
        verify(mediator).stop();
        verify(mediator, times(2)).press();
        assertFalse(fan.isOn());
        assertFalse(powerSupply.isOn());
    }
}