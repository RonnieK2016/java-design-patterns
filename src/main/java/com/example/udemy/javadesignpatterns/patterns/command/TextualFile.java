package com.example.udemy.javadesignpatterns.patterns.command;

public class TextualFile implements File {
    @Override
    public String open() {
        return "Opening Text File";
    }

    @Override
    public String save() {
        return "Saving Text File";
    }
}
