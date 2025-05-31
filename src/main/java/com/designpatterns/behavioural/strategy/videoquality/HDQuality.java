package com.designpatterns.behavioural.strategy.videoquality;

public class HDQuality implements VideoQuality {
    @Override
    public void load(String title) {
        System.out.println("Video "+title+" is playing in HD Quality");
    }
}
