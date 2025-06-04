package com.designpatterns.behavioural.command;

public class TV {
    public void turnOn()
    {
        System.out.println("Turning ON TV");
    }
    public void turnOff()
    {
        System.out.println("Turning OFF TV");
    }
    public void changeChannel(int channel)
    {
        System.out.println("TV channel changed to : "+channel);
    }
    public void volumeSet(int volume)
    {
        System.out.println("TV colume set to : "+volume);
    }
}
