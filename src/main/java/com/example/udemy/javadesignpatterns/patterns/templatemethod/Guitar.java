package com.example.udemy.javadesignpatterns.patterns.templatemethod;

public abstract class Guitar {

    protected abstract void buildNeck();
    protected abstract void buildBody();
    protected abstract void buildBridge();
    protected abstract void buildPickups();

    public final Guitar buildGuitar() {
        buildNeck();
        buildBody();
        buildPickups();
        buildBridge();
        return this;
    }
}
