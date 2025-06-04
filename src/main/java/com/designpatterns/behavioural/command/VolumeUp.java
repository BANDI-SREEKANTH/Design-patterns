package com.designpatterns.behavioural.command;

public class VolumeUp implements Command{
    TV tv;
    private int volume;
    public VolumeUp(TV tv, int volume)
    {
        this.tv=tv;
        this.volume=volume;
    }
    public void execute()
    {
        tv.volumeSet(volume);
    }
}
