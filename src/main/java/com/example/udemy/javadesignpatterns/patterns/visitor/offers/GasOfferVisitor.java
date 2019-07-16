package com.example.udemy.javadesignpatterns.patterns.visitor.offers;

import com.example.udemy.javadesignpatterns.patterns.visitor.cards.BronzeCard;
import com.example.udemy.javadesignpatterns.patterns.visitor.cards.GoldCard;
import com.example.udemy.javadesignpatterns.patterns.visitor.cards.SilverCard;

public class GasOfferVisitor implements OfferVisitor {
    @Override
    public String computeCashBackForBronzeCard(BronzeCard card) {
        return "Gas cashback for " + card.getName();
    }

    @Override
    public String computeCashBackForSilverCard(SilverCard card) {
        return "Gas cashback for " + card.getName();
    }

    @Override
    public String computeCashBackForGoldCard(GoldCard card) {
        return "Gas cashback for " + card.getName();
    }
}
