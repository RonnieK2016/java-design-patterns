package com.example.udemy.javadesignpatterns.patterns.ioc;

public class QueryExecutor {

    private Query query;

    private DatabaseConnection connection;

    public QueryExecutor(Query query, DatabaseConnection connection) {
        this.query = query;
        this.connection = connection;
    }

    public void execute() {
        if(!this.connection.isConnected()) {
            this.connection.connect();
        }

        query.execute();
    }
}
