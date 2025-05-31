package com.designpatterns.behavioural.strategy.videoquality;

public class MobilePlayer extends VideoPlayer{
    public MobilePlayer(VideoQuality videoQuality)
    {
        super(videoQuality);
    }
    public void play(String title)
    {
        videoQuality.load(title);
    }
}
