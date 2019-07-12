package com.example.udemy.javadesignpatterns.patterns.command;

public class SaveFileOperation implements FileOperation {

    private File file;

    public SaveFileOperation(File file) {
        this.file = file;
    }

    @Override
    public String execute() {
        return file.save();
    }
}
