package com.example.udemy.javadesignpatterns.patterns;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class SingletonStaticInitTest {

    @Test
    public void testSingleton() throws InterruptedException {
        List<Callable<Void>> tasks = new ArrayList<>();

        ExecutorService executorService = Executors.newFixedThreadPool(100);


        for(int i = 0; i < 2000000; i++) {
            tasks.add(() ->
            {
                SingletonStaticInit.getInstance().increment();
                return null;
            });
        }

        executorService.invokeAll(tasks);

        executorService.shutdown();

        if(!executorService.isTerminated()) {
            executorService.awaitTermination(10000, TimeUnit.MILLISECONDS);
        }

        assertEquals(2000000, SingletonStaticInit.getInstance().getCounter());

    }

}