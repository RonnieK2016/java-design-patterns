package com.example.udemy.javadesignpatterns.patterns.ioc;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class QueryExecutorTest {

    @Test
    public void verifyMySqlQueryExecutor() {

        DatabaseConnection mySqlConnection = spy(new MySqlDatabaseConnection());

        Query mySqlQuery = spy(new MySqlQuery());

        QueryExecutor queryExecutor = new QueryExecutor(mySqlQuery, mySqlConnection);

        queryExecutor.execute();

        verify(mySqlConnection).isConnected();
        verify(mySqlConnection).connect();
        verify(mySqlQuery).execute();

        queryExecutor.execute();

        verify(mySqlConnection, times(2)).isConnected();
        verify(mySqlConnection).connect();
        verify(mySqlQuery, times(2)).execute();
    }
}