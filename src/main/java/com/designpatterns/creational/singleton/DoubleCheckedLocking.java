package com.designpatterns.creational.singleton;

public class DoubleCheckedLocking
{
	private volatile static DoubleCheckedLocking logger;
	private DoubleCheckedLocking() {};
	public static DoubleCheckedLocking getInstance()
	{
		if(logger==null)
		{
			synchronized(DoubleCheckedLocking.class)
			{
				if(logger==null)
				{
					logger=new DoubleCheckedLocking();
				}
			}
		}
		return logger;
	}
}
