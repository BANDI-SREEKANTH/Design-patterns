package com.designpatterns.behavioural.observer.youtubechannel;

public class Main {
    public static void main(String[] args)
    {
        Subcriber youtubeSubscriber=new YoutubeSubscriber("sreekanth");
        YoutubeChannelImpl youtubeChannel=new YoutubeChannelImpl("Tech-channel");
        youtubeChannel.addSubscriber(youtubeSubscriber);
        youtubeChannel.updateSubscriber("Caching");
         Subcriber emailSubcriber=new EmailSubscriber("bindhu");
         youtubeChannel.addSubscriber(emailSubcriber);
         emailSubcriber.update("scaling");

    }
}
