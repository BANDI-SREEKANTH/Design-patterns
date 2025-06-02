package com.designpatterns.behavioural.observer.youtubechannel;

import java.util.concurrent.Flow;

public interface Channel {
    public void addSubscriber(Subcriber subscriber);
    public void removeSubscriber(Subcriber subscriber);
    public void updateSubscriber(String video);
}
