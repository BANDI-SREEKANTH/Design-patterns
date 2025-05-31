package com.designpatterns.behavioural.strategy.videoquality;

public class WebPlayer extends VideoPlayer{
    public WebPlayer(VideoQuality videoQuality)
    {
        super(videoQuality);
    }

    @Override
    public void play(String title) {
        videoQuality.load(title);
    }
}
