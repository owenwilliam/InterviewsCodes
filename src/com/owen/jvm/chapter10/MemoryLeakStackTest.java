package com.owen.jvm.chapter10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 
 * @author OwenWilliam 2016-9-16
 *
 */
public class MemoryLeakStackTest
{

	@Test
	public void test()
	{
		final MemoryLeakStack<String> stack = new MemoryLeakStack<>();

		for (int i = 0; i < 10; i++)
		{
			stack.push(String.format("Element %d", i));
		}

		for (int i = 9; i >= 0; i--)
		{
			assertEquals(String.format("Element %d", i), stack.pop());
		}

		for (int i = 0; i < 10; i++)
		{
			stack.push(String.format("Element %d", i));
		}

		for (int i = 9; i >= 0; i--)
		{
			assertEquals(String.format("Element %d", i), stack.pop());
		}
	}
}
