package com.example.udemy.javadesignpatterns.patterns.mediator;

public class Button {

    private Mediator mediator;

    public Button(Mediator mediator) {
        this.mediator = mediator;
    }

    public void press() {
        mediator.press();
    }
}
