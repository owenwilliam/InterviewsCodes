package com.owen.despattern.chapter06.singleton;

/**
 * A problematic singleton
 * 
 * @author OwenWilliam 2016-9-15
 *
 */
public class Singleton
{

	private static Singleton INSTANCE;

	public static Singleton getInstance()
	{
		if (INSTANCE == null)
		{
			INSTANCE = new Singleton();
		}

		return INSTANCE;
	}

	public void singletonMethod()
	{
		// operations here
	}
}
