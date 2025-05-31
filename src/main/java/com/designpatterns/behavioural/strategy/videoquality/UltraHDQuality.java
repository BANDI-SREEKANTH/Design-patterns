package com.designpatterns.behavioural.strategy.videoquality;

public class UltraHDQuality implements VideoQuality {
    public void load(String title) {
        System.out.println("Video "+title+" is playing in Ultra HD Quality");
    }
}
