package com.designpatterns.behavioural.command;

public class RemoteControl {
    public Command onComamnd;
    public Command offCommand;
    public void setOnCommand(Command onComamnd)
    {
        this.onComamnd=onComamnd;
    }
    public void setOffCommand(Command offCommand)
    {
        this.offCommand=offCommand;
    }
    public void pressOncommand()
    {
        onComamnd.execute();
    }
    public void pressOffCommand()
    {
        offCommand.execute();
    }
}
