package com.owen.despattern.chapter06.flyweight;

import org.junit.Test;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

/**
 * The Flyweight Pattern in action
 * 
 * @author OwenWilliam  2016-9-15
 *
 */
public class IntegerFlyweight
{

	@Test
	public void sameIntegerInstances()
	{
		final Integer a = Integer.valueOf(56);
		final Integer b = Integer.valueOf(56);

		assertSame(a, b);

		final Integer c = Integer.valueOf(472);
		final Integer d = Integer.valueOf(472);

		assertNotSame(c, d);
	}
}
