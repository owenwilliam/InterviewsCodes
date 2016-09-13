package com.owen.javabasics.chapter08;

import junit.framework.TestCase;

/**
 * 
 * @author OwenWilliam 2016-9-16
 *
 */
public class JUnit3Example extends TestCase
{

	private int myInt;

	public void setUp()
	{
		System.out.println("set Up");
		myInt = 42;
	}

	public void testMyIntValue()
	{
		System.out.println("Int value");
		assertEquals(42, myInt);
	}

	public void tearDown()
	{
		System.out.println("down");
		myInt = -1;
	}
}
