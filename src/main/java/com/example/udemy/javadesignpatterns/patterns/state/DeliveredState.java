package com.example.udemy.javadesignpatterns.patterns.state;

public class DeliveredState implements PackageState {

    @Override
    public void next(Package pack) {
        System.out.println("This is final state");
    }

    @Override
    public void prev(Package pack) {
        pack.setState(new InTransitState());
    }

    @Override
    public String printStatus() {
        return DeliveredState.class.getSimpleName();
    }
}
