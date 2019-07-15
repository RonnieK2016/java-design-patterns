package com.example.udemy.javadesignpatterns.patterns.strategy;

public class EngineerRepairable implements RepairStrategy {
    @Override
    public String repair() {
        return "Repaired by Engineer!";
    }
}
