package com.example.udemy.javadesignpatterns.patterns.visitor.cards;

import com.example.udemy.javadesignpatterns.patterns.visitor.offers.OfferVisitor;

public class BronzeCard implements CreditCard {

    @Override
    public String getName() {
        return BronzeCard.class.getSimpleName();
    }

    @Override
    public String accept(OfferVisitor v) {
        return v.computeCashBackForBronzeCard(this);
    }
}
