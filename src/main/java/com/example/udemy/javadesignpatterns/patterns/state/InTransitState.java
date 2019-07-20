package com.example.udemy.javadesignpatterns.patterns.state;

public class InTransitState implements PackageState {

    @Override
    public void next(Package pack) {
        pack.setState(new DeliveredState());
    }

    @Override
    public void prev(Package pack) {
        pack.setState(new OrderedState());
    }

    @Override
    public String printStatus() {
        return InTransitState.class.getSimpleName();
    }
}
