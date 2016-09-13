package com.owen.javabasics.chapter08;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
/**
 * 
 * @author OwenWilliam 2016-9-16
 *
 */
public class ArrayVariance
{

	class A
	{
	}

	class B extends A
	{
	}

	@Test
	public void showArrayVariance()
	{

		A a = new B();

		assertTrue(a instanceof A);

		A[] arrayOfA = new B[] { new B() };

		assertFalse(arrayOfA instanceof A[]);
	}
}
