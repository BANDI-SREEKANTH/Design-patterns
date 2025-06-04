package com.designpatterns.behavioural.command;

public class OnCommand implements Command{
    TV tv;
    public OnCommand(TV tv)
    {
        this.tv=tv;
    }
    @Override
    public void execute() {
        tv.turnOn();
    }
}
