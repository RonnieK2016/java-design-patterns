package com.example.udemy.javadesignpatterns.patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class NewsChannel implements Observer {

    private String newsChannelNews;

    public String getNewsChannelNews() {
        return newsChannelNews;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.newsChannelNews = (String) arg;
    }
}
