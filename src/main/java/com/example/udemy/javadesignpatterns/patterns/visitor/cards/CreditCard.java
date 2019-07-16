package com.example.udemy.javadesignpatterns.patterns.visitor.cards;

import com.example.udemy.javadesignpatterns.patterns.visitor.offers.OfferVisitor;

public interface CreditCard {

    String getName();

    String accept(OfferVisitor v);
}
