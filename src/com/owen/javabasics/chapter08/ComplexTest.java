package com.owen.javabasics.chapter08;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 
 * @author OwenWilliam 2016-9-16
 *
 */
public class ComplexTest
{

	@Test
	public void complexNumberAddition()
	{
		final Complex expected = new Complex(6, 2);

		final Complex a = new Complex(8, 0);
		final Complex b = new Complex(-2, 2);

		assertEquals(a.add(b), expected);
	}

}
