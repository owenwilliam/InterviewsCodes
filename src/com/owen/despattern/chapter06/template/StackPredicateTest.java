package com.owen.despattern.chapter06.template;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Implementing the StackPredicate template
 * 
 * @author OwenWilliam 2016-9-15
 *
 */
public class StackPredicateTest
{

	private Stack stack;

	@Before
	public void createStack()
	{
		stack = new Stack();
		for (int i = 1; i <= 10; i++)
		{
			stack.push(i);
		}
	}

	@Test
	public void evenPredicate()
	{
		final Stack filtered = stack.filter(new StackPredicate()
		{
			@Override
			public boolean isValid(int i)
			{
				return (i % 2 == 0);
			}
		});
     /*  final StackImp filtered1 = new StackImp();
       final Stack filtered = stack.filter(filtered1);*/
		assertEquals(Integer.valueOf(10), filtered.pop());
		assertEquals(Integer.valueOf(8), filtered.pop());
		assertEquals(Integer.valueOf(6), filtered.pop());
	}

	@Test
	public void allPredicate()
	{
		final Stack filtered = stack.filter(new StackPredicate()
		{
			@Override
			public boolean isValid(int i)
			{
				return true;
			}
		});

		assertEquals(Integer.valueOf(10), filtered.pop());
		assertEquals(Integer.valueOf(9), filtered.pop());
		assertEquals(Integer.valueOf(8), filtered.pop());
	}
}
