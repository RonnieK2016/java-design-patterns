package com.example.udemy.javadesignpatterns.patterns.command;

public class OpenFileOperation implements FileOperation {

    private File file;

    public OpenFileOperation(File file) {
        this.file = file;
    }

    @Override
    public String execute() {
        return file.open();
    }
}
