package com.owen.junit.chapter09;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * How do you verify that your tests are successful?
 * 
 * @author OwenWilliam 2016-9-17
 *
 */
public class SimpleJUnitExpectations
{

	/**
	 * Assertion with a failure message
	 */
	@Test
	public void assertionWithMessage()
	{
		final List<Integer> numbers = new ArrayList<>();
		numbers.add(1);

		assertTrue("The list is not empty", numbers.isEmpty());
	}

	/**
	 * Assertion without a failure message
	 */
	@Test
	public void assertionWithoutMessage()
	{
		final List<Integer> numbers = new ArrayList<>();
		numbers.add(1);

		assertTrue(numbers.isEmpty());
	}

	@Test
	public void assertionEqualsWithoutMessage()
	{
		assertEquals(1, 2);
	}
}
