package com.example.udemy.javadesignpatterns.patterns.strategy;

public class Unrepairable implements RepairStrategy {
    @Override
    public String repair() {
        return "Not a repairable unit!";
    }
}
