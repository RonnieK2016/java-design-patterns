package com.example.udemy.javadesignpatterns.patterns.proxy;

import org.junit.Test;

import static org.junit.Assert.*;

public class InternetProxyTest {

    @Test
    public void verifyCanConnectToNotBannedSite() {
        Internet proxy = new InternetProxy();

        assertTrue(proxy.connectTo("google.com"));
    }

    @Test
    public void verifyCannotConnectToBannedSite() {
        Internet proxy = new InternetProxy();

        assertFalse(proxy.connectTo("banned-site.com"));
    }

}