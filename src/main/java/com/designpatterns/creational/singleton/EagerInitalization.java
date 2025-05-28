package com.designpatterns.creational.singleton;

public class EagerInitalization
{
	private static EagerInitalization logger=new EagerInitalization();
	private EagerInitalization() {}
	public static EagerInitalization getInstance()
	{
		return logger;
	}
}
