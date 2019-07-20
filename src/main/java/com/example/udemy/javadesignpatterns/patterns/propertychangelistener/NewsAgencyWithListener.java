package com.example.udemy.javadesignpatterns.patterns.propertychangelistener;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class NewsAgencyWithListener {

    private String news;

    private PropertyChangeSupport propertyChangeSupport;

    public NewsAgencyWithListener() {
        this.propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener) {
        propertyChangeSupport.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropertyChangeListener(PropertyChangeListener propertyChangeListener) {
        propertyChangeSupport.removePropertyChangeListener(propertyChangeListener);
    }

    public void updateNews(String newsUpdatedValue) {
        propertyChangeSupport.firePropertyChange("news", this.news, newsUpdatedValue);
        this.news = newsUpdatedValue;
    }
}
