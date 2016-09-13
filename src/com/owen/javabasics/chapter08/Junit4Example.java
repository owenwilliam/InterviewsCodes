package com.owen.javabasics.chapter08;

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author OwenWilliam 2016-9-16
 *
 */
public class Junit4Example
{

	private int myInt;

	@Before
	public void assignIntValue()
	{
		myInt = 42;
	}

	@Test
	public void checkIntValueIsCorrect()
	{
		Assert.assertEquals(42, myInt);
	}

	@After
	public void unsetIntValue()
	{
		myInt = -1;
	}
}
