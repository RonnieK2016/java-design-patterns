package com.example.udemy.javadesignpatterns.patterns.visitor.offers;

import com.example.udemy.javadesignpatterns.patterns.visitor.cards.BronzeCard;
import com.example.udemy.javadesignpatterns.patterns.visitor.cards.GoldCard;
import com.example.udemy.javadesignpatterns.patterns.visitor.cards.SilverCard;

public interface OfferVisitor {

    String computeCashBackForBronzeCard(BronzeCard card);

    String computeCashBackForSilverCard(SilverCard card);

    String computeCashBackForGoldCard(GoldCard card);
}
