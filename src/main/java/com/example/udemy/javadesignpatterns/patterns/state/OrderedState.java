package com.example.udemy.javadesignpatterns.patterns.state;

public class OrderedState implements PackageState {

    @Override
    public void next(Package pack) {
        pack.setState(new InTransitState());
    }

    @Override
    public void prev(Package pack) {
        System.out.println("Package is in its initial state");
    }

    @Override
    public String printStatus() {
        return OrderedState.class.getSimpleName();
    }
}
