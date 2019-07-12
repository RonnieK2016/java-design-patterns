package com.example.udemy.javadesignpatterns.patterns.command;

import org.junit.Test;

import static org.junit.Assert.*;

public class FileOperationExecutorTest {

    @Test
    public void verifyTextualFileCanBeOpenedAndSaved() {
        OperationExecutor operationExecutor = new FileOperationExecutor();
        File textFile = new TextualFile();

        assertEquals("Opening Text File", operationExecutor.execute(new OpenFileOperation(textFile)));
        assertEquals("Saving Text File", operationExecutor.execute(new SaveFileOperation(textFile)));
    }

}