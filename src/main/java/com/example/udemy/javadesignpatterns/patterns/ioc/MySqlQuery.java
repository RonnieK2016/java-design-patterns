package com.example.udemy.javadesignpatterns.patterns.ioc;

public class MySqlQuery implements Query {
    @Override
    public void execute() {
        System.out.println("Executing MySQL Query");
    }
}
