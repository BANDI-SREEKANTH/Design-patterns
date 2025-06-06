package com.designpatterns.structural.proxy.VideoService;
public class RealVideoService implements VideoServiceInterface {
    @Override
    public void playVideo(String userType, String videoName) {
        System.out.println("Streaming video: " + videoName);
    }
}