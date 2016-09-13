package com.owen.jvm.chapter10;

import org.junit.Test;

import java.util.ArrayList;

/**
 * 
 * @author OwenWilliam 2016-9-16
 *
 */
public class OutOfMemoryRunner
{

	@Test
	public void outOfMemoryCrash()
	{
		final ArrayList<Long> longs = new ArrayList<>();
		while (true)
		{
			longs.add(System.currentTimeMillis());
		}
	}

	@Test
	public void stackOverflow()
	{
		stackOverflow();
	}
}
