package com.example.udemy.javadesignpatterns.patterns.state;

import org.junit.Test;

import static org.junit.Assert.*;

public class PackageTest {

    @Test
    public void verifyPackageIsCreatedInOrderedState() {
        Package pack = new Package();

        assertEquals("OrderedState", pack.printStatus());
    }

    @Test
    public void verifyPackageNotMovedBackFromOrderedState() {
        Package pack = new Package();

        pack.prevState();

        assertEquals("OrderedState", pack.printStatus());
    }

    @Test
    public void verifyPackageMovedFromOrderedStateToInTransitAndBack() {
        Package pack = new Package();

        pack.nextState();

        assertEquals("InTransitState", pack.printStatus());

        pack.prevState();

        assertEquals("OrderedState", pack.printStatus());
    }

    @Test
    public void verifyPackageMovedFromInTransitStateToDeliveredAndBack() {
        Package pack = new Package(new InTransitState());

        assertEquals("InTransitState", pack.printStatus());

        pack.nextState();

        assertEquals("DeliveredState", pack.printStatus());

        pack.prevState();

        assertEquals("InTransitState", pack.printStatus());
    }

    @Test
    public void verifyDeliveredIsFinalState() {
        Package pack = new Package(new DeliveredState());
        assertEquals("DeliveredState", pack.printStatus());
        pack.nextState();
        assertEquals("DeliveredState", pack.printStatus());
    }

}