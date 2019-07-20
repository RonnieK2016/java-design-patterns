package com.example.udemy.javadesignpatterns.patterns.observer;

import org.junit.Test;

import static org.junit.Assert.*;

public class NewsAgencyTest {


    @Test
    public void verifyAllChannelsReceiveUpdatedNews() {
        NewsChannel channel1 = new NewsChannel();
        NewsChannel channel2 = new NewsChannel();
        NewsAgency newsAgency = new NewsAgency();
        newsAgency.addObserver(channel1);
        newsAgency.addObserver(channel2);
        String testNews = "Test News For Notify";
        newsAgency.setNews(testNews);

        assertEquals(testNews, channel1.getNewsChannelNews());
        assertEquals(testNews, channel2.getNewsChannelNews());

        String testNews2 = "Test News For Notify 2";
        newsAgency.setNews(testNews2);

        assertEquals(testNews2, channel1.getNewsChannelNews());
        assertEquals(testNews2, channel2.getNewsChannelNews());
    }

}