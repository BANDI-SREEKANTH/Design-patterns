package com.designpatterns.behavioural.command;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv=new TV();
		Command onCommand=new OnCommand(tv);
		Command offCommand=new OffCommand(tv);
		Command changeChannelCommand=new ChangeChannel(tv,24);
		Command volumeUp=new VolumeUp(tv,24);

		//creating remote control
		RemoteControl remote=new RemoteControl();
		remote.setOnCommand(onCommand);
		remote.setOffCommand(offCommand);
		remote.pressOncommand();
		changeChannelCommand.execute();
		volumeUp.execute();
		remote.pressOffCommand();
	}

}
