package com.example.udemy.javadesignpatterns.patterns.strategy;

public class SelfRepairable implements RepairStrategy {
    @Override
    public String repair() {
        return "Self repairable unit!";
    }
}
