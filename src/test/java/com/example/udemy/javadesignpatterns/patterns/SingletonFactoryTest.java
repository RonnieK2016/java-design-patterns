package com.example.udemy.javadesignpatterns.patterns;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonFactoryTest {

    @Test
    public void testDoubleCheckedSingleton() {

        Singleton singleton = SingletonFactory.getSingleton("DOUBLE_CHECKED");

        assertEquals(SingletonDoubleCheckedLock.class, singleton.getClass());

    }

    @Test
    public void testStaticInitSingleton() {

        Singleton singleton = SingletonFactory.getSingleton("STATIC_INIT");

        assertEquals(SingletonStaticInit.class, singleton.getClass());

    }

    @Test
    public void testUnsupportedType() {

        Singleton singleton = SingletonFactory.getSingleton("SOME_TYPE");

        assertNull(singleton);

    }
}