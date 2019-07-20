package com.example.udemy.javadesignpatterns.patterns.state;

public class Package {

    private PackageState state;

    public Package() {
        state = new OrderedState();
    }

    public Package(PackageState state) {
        this.state = state;
    }

    public void nextState() {
        state.next(this);
    }

    public void prevState() {
        state.prev(this);
    }
    

    public void setState(PackageState state) {
        this.state = state;
    }

    public String printStatus() {
        return state.printStatus();
    }
}
