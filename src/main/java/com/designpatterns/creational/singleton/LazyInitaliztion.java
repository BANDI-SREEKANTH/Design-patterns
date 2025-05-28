package com.designpatterns.creational.singleton;

public class LazyInitaliztion
{
	private static LazyInitaliztion logger;
	private LazyInitaliztion() {};
	public static LazyInitaliztion getInstance()
	{
		if(logger==null) {
			
		logger= new LazyInitaliztion();
		return logger;
		}
		
		return logger;
	}
}
