package com.example.udemy.javadesignpatterns.patterns.strategy;

public class Soldier implements Repairable {

    private RepairStrategy repairStrategy;

    public Soldier(RepairStrategy repairStrategy) {
        this.repairStrategy = repairStrategy;
    }

    @Override
    public String repair() {
        return repairStrategy.repair();
    }
}
