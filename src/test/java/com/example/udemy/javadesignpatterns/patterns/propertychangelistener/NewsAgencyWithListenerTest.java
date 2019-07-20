package com.example.udemy.javadesignpatterns.patterns.propertychangelistener;

import org.junit.Test;

import static org.junit.Assert.*;

public class NewsAgencyWithListenerTest {

    @Test
    public void verifyAllChannelsReceiveUpdatedNews() {
        NewsChannelWithListener channel1 = new NewsChannelWithListener();
        NewsChannelWithListener channel2 = new NewsChannelWithListener();
        NewsAgencyWithListener newsAgency = new NewsAgencyWithListener();
        newsAgency.addPropertyChangeListener(channel1);
        newsAgency.addPropertyChangeListener(channel2);
        String testNews = "Test News For Notify";
        newsAgency.updateNews(testNews);

        assertEquals(testNews, channel1.getNewsOnNewsChannel());
        assertEquals(testNews, channel2.getNewsOnNewsChannel());

        String testNews2 = "Test News For Notify 2";
        newsAgency.updateNews(testNews2);

        assertEquals(testNews2, channel1.getNewsOnNewsChannel());
        assertEquals(testNews2, channel2.getNewsOnNewsChannel());
    }

    @Test
    public void verifyChannelCanBeRemovedFromSubscription() {
        NewsChannelWithListener channel1 = new NewsChannelWithListener();
        NewsChannelWithListener channel2 = new NewsChannelWithListener();
        NewsAgencyWithListener newsAgency = new NewsAgencyWithListener();
        newsAgency.addPropertyChangeListener(channel1);
        newsAgency.addPropertyChangeListener(channel2);
        String testNewsBeforeRemoval = "Test News For Notify Before Removal";
        newsAgency.updateNews(testNewsBeforeRemoval);

        assertEquals(testNewsBeforeRemoval, channel1.getNewsOnNewsChannel());
        assertEquals(testNewsBeforeRemoval, channel2.getNewsOnNewsChannel());

        String testNewsAfterRemoval = "Test News For Notify 2 After Removal";
        newsAgency.removePropertyChangeListener(channel2);
        newsAgency.updateNews(testNewsAfterRemoval);

        assertEquals(testNewsAfterRemoval, channel1.getNewsOnNewsChannel());
        assertEquals(testNewsBeforeRemoval, channel2.getNewsOnNewsChannel());
    }
}