package com.owen.jvm.chapter10;

import org.junit.Test;

import java.util.Date;

/**
 * 
 * @author OwenWilliam 2016-9-16
 *
 */
public class ShutdownHookExample
{

	@Test
	public void addShudownHook()
	{
		Runtime.getRuntime().addShutdownHook(new Thread()
		{
			@Override
			public void run()
			{
				System.err.println("Shutting down JVM at time: " + new Date());
			}
		});
	}
}
