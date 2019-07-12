package com.example.udemy.javadesignpatterns.patterns.chain;

public interface AuthProcessor {

    boolean authorize(AuthenticationProvider authProvider);
}
