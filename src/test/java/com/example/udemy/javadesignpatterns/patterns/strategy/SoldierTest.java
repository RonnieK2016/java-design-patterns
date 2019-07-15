package com.example.udemy.javadesignpatterns.patterns.strategy;

import org.junit.Test;

import static org.junit.Assert.*;

public class SoldierTest {

    @Test
    public void verifyDifferentTypesOfRepairCanBeUsed() {

        Soldier robot = new Soldier(new EngineerRepairable());

        assertEquals("Repaired by Engineer!", robot.repair());

        Soldier ironMan = new Soldier(new SelfRepairable());

        assertEquals("Self repairable unit!", ironMan.repair());

        Soldier human = new Soldier(new Unrepairable());
        
        assertEquals("Not a repairable unit!", human.repair());
    }

}