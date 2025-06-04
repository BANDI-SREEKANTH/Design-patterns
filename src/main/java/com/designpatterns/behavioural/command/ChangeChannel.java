package com.designpatterns.behavioural.command;

import com.designpatterns.behavioural.observer.youtubechannel.Channel;

public class ChangeChannel implements Command{
    TV tv;
    public int channel;
    public ChangeChannel(TV tv,int channel)
    {
        this.tv=tv;
        this.channel=channel;
    }
    public void execute()
    {
        tv.changeChannel(channel);
    }
}
