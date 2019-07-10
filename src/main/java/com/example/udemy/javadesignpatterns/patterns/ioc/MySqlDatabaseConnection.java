package com.example.udemy.javadesignpatterns.patterns.ioc;

public class MySqlDatabaseConnection implements DatabaseConnection {

    private boolean connected;

    @Override
    public void connect() {
        System.out.println("Connected to MySQL Database");
        connected = true;
    }

    @Override
    public boolean isConnected() {
        return connected;
    }
}
