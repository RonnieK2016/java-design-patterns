package com.example.udemy.javadesignpatterns.patterns.command;

public class FileOperationExecutor  implements OperationExecutor{


    @Override
    public String execute(FileOperation operation) {
        return operation.execute();
    }
}
