package com.example.udemy.javadesignpatterns.patterns.composite;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class ValidationRuleSetTest {

    @Test
    public void verifyStructureAndViewValidationRules() {
        ViewValidationRule viewValidationRule = spy(new ViewValidationRule());
        StructureValidationRule structureValidationRule = spy(new StructureValidationRule());

        ValidationRuleSet validationRuleSet = new ValidationRuleSet();

        validationRuleSet.addRule(viewValidationRule);
        validationRuleSet.addRule(structureValidationRule);

        assertTrue(validationRuleSet.validate());

        verify(viewValidationRule).validate();
        verify(structureValidationRule).validate();
    }

    @Test
    public void verifyBehaviourAndViewValidationRules() {
        ViewValidationRule viewValidationRule = spy(new ViewValidationRule());
        BehaviourValidationRule behaviourValidationRule = spy(new BehaviourValidationRule());

        ValidationRuleSet validationRuleSet = new ValidationRuleSet();

        validationRuleSet.addRule(viewValidationRule);
        validationRuleSet.addRule(behaviourValidationRule);

        assertFalse(validationRuleSet.validate());

        verify(viewValidationRule).validate();
        verify(behaviourValidationRule).validate();
    }

}