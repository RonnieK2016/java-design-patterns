package com.example.udemy.javadesignpatterns.patterns.propertychangelistener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class NewsChannelWithListener implements PropertyChangeListener {

    private String newsOnNewsChannel;

    public String getNewsOnNewsChannel() {
        return newsOnNewsChannel;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.newsOnNewsChannel = (String) evt.getNewValue();
    }
}
