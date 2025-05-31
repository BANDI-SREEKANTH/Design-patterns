package com.designpatterns.behavioural.strategy.videoquality;

public class Main {
    public static void main(String[] args)
    {
        SDQuality sdQuality=new SDQuality();
        HDQuality hdQuality=new HDQuality();
        UltraHDQuality ultraHDQuality=new UltraHDQuality();
        VideoPlayer mobileVideoPlayer=new MobilePlayer(sdQuality);
        VideoPlayProcessor videoPlayProcessor=new VideoPlayProcessor(mobileVideoPlayer);
        videoPlayProcessor.playVideo("SVSC");
        VideoPlayer webVideoPlayer =new WebPlayer(hdQuality);
        videoPlayProcessor.setVideoPlayer(webVideoPlayer);
        videoPlayProcessor.playVideo("Nayak");
    }
}
