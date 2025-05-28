package com.designpatterns.creational.singleton;

public class Synchronizedd
{
	private static Synchronizedd logger;
	private Synchronizedd() {};
	public static synchronized Synchronizedd getInstance()
	{
		if(logger==null)
		{
			
			logger= new Synchronizedd();
		}
		return logger;
	}
}
