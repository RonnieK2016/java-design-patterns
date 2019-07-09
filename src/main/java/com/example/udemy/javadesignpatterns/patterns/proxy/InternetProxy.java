package com.example.udemy.javadesignpatterns.patterns.proxy;

import java.util.HashSet;

public class InternetProxy implements Internet {

    private Internet internet;

    private static HashSet<String> banned = new HashSet<>();


    static {
        banned.add("banned-site.com");
    }

    private synchronized void initialize() {
        if(internet == null) {
            internet = new RealInternet();
        }
    }

    @Override
    public boolean connectTo(String site) {

        if(internet == null) {
            initialize();
        }

        if(banned.contains(site)) {
            return false;
        }

        return internet.connectTo(site);
    }
}
