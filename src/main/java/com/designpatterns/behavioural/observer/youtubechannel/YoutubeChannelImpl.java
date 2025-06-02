package com.designpatterns.behavioural.observer.youtubechannel;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannelImpl implements Channel{
    List<Subcriber> subscribers= new ArrayList<>();
    String name;
    public YoutubeChannelImpl(String name)
    {
        this.name=name;
    }
    @Override
    public void updateSubscriber(String video) {
        for(Subcriber subcriber:subscribers)
        {
            subcriber.update(video);
        }
    }

    @Override
    public void removeSubscriber(Subcriber subcriber) {
        if(subscribers.contains(subcriber))
        {
            subscribers.remove(subcriber);
        }
    }

    @Override
    public void addSubscriber(Subcriber subcriber) {
        subscribers.add(subcriber);
    }
}
