package com.designpatterns.behavioural.strategy.videoquality;

public abstract class VideoPlayer {
    VideoQuality videoQuality;
    public VideoPlayer(VideoQuality videoQuality)
    {
        this.videoQuality=videoQuality;
    }
    public abstract void play(String title);
}
