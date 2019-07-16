package com.example.udemy.javadesignpatterns.patterns.visitor.offers;

import com.example.udemy.javadesignpatterns.patterns.visitor.cards.BronzeCard;
import com.example.udemy.javadesignpatterns.patterns.visitor.cards.CreditCard;
import com.example.udemy.javadesignpatterns.patterns.visitor.cards.GoldCard;
import com.example.udemy.javadesignpatterns.patterns.visitor.cards.SilverCard;
import org.junit.Test;

import static org.junit.Assert.*;

public class GasOfferVisitorTest {

    @Test
    public void verifyGasOfferForDifferentCards() {
        OfferVisitor gasOfferVisitor = new GasOfferVisitor();

        CreditCard bronzeCard = new BronzeCard();
        assertEquals("Gas cashback for BronzeCard", bronzeCard.accept(gasOfferVisitor));

        CreditCard silverCard = new SilverCard();
        assertEquals("Gas cashback for SilverCard", silverCard.accept(gasOfferVisitor));

        CreditCard goldCard = new GoldCard();
        assertEquals("Gas cashback for GoldCard", goldCard.accept(gasOfferVisitor));
    }
}