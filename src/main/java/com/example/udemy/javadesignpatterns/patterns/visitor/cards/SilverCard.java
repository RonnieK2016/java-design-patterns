package com.example.udemy.javadesignpatterns.patterns.visitor.cards;

import com.example.udemy.javadesignpatterns.patterns.visitor.offers.OfferVisitor;

public class SilverCard implements CreditCard {
    @Override
    public String getName() {
        return SilverCard.class.getSimpleName();
    }

    @Override
    public String accept(OfferVisitor v) {
        return v.computeCashBackForSilverCard(this);
    }
}
