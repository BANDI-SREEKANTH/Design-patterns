package com.designpatterns.behavioural.command;

public class OffCommand implements Command{
    TV tv;
    public OffCommand(TV tv)
    {
        this.tv=tv;
    }
    @Override
    public void execute() {
        tv.turnOff();
    }
}
