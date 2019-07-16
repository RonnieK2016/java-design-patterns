package com.example.udemy.javadesignpatterns.patterns.visitor.offers;

import com.example.udemy.javadesignpatterns.patterns.visitor.cards.BronzeCard;
import com.example.udemy.javadesignpatterns.patterns.visitor.cards.CreditCard;
import com.example.udemy.javadesignpatterns.patterns.visitor.cards.GoldCard;
import com.example.udemy.javadesignpatterns.patterns.visitor.cards.SilverCard;
import org.junit.Test;

import static org.junit.Assert.*;

public class HotelOfferVisitorTest {

    @Test
    public void verifyHotelOfferForDifferentCards() {
        OfferVisitor hotelOfferVisitor = new HotelOfferVisitor();

        CreditCard bronzeCard = new BronzeCard();
        assertEquals("Hotel cashback for BronzeCard", bronzeCard.accept(hotelOfferVisitor));

        CreditCard silverCard = new SilverCard();
        assertEquals("Hotel cashback for SilverCard", silverCard.accept(hotelOfferVisitor));

        CreditCard goldCard = new GoldCard();
        assertEquals("Hotel cashback for GoldCard", goldCard.accept(hotelOfferVisitor));
    }

}