package com.designpatterns.behavioural.strategy.videoquality;

public class SDQuality implements VideoQuality {
    public void load(String title) {
        System.out.println("Video "+title+" is playing in SD Quality");
    }
}
