package com.example.udemy.javadesignpatterns.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class ValidationRuleSet implements ValidationRule  {

    private List<ValidationRule> rules = new ArrayList<>();

    public void addRule(ValidationRule rule) {
        rules.add(rule);
    }

    @Override
    public boolean validate() {

        for(ValidationRule rule : rules) {
            if(!rule.validate()) {
                return false;
            }
        }

        return true;
    }
}
