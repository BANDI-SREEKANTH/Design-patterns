package com.designpatterns.behavioural.observer.youtubechannel;

public class YoutubeSubscriber implements Subcriber {
    private String name;
    public YoutubeSubscriber(String name)
    {
        this.name=name;
    }
    @Override
    public void update(String video) {
        System.out.println(name+" is playing video "+video);
    }
}
