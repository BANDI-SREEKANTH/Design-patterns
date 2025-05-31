package com.designpatterns.behavioural.strategy.videoquality;

public class VideoPlayProcessor {
    public VideoPlayer videoPlayer;
    public VideoPlayProcessor(VideoPlayer videoPlayer)
    {
        this.videoPlayer=videoPlayer;
    }
    public void playVideo(String title)
    {
        videoPlayer.play(title);
    }
    public void setVideoPlayer(VideoPlayer videoPlayer)
    {
        this.videoPlayer=videoPlayer;
    }
}
