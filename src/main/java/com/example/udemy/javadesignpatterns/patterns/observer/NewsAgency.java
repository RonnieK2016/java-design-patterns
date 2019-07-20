package com.example.udemy.javadesignpatterns.patterns.observer;

import java.util.Observable;

public class NewsAgency extends Observable {

    private String news;

    public void setNews(String news) {
        this.news = news;
        setChanged();
        this.notifyObservers(news);
    }
}
