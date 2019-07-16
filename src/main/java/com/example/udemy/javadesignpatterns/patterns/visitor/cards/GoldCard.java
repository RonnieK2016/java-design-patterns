package com.example.udemy.javadesignpatterns.patterns.visitor.cards;

import com.example.udemy.javadesignpatterns.patterns.visitor.offers.OfferVisitor;

public class GoldCard implements CreditCard {
    @Override
    public String getName() {
        return GoldCard.class.getSimpleName();
    }

    @Override
    public String accept(OfferVisitor v) {
        return v.computeCashBackForGoldCard(this);
    }
}
