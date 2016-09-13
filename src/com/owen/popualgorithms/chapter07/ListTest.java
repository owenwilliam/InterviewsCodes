package com.owen.popualgorithms.chapter07;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * 
 * @author OwenWilliam 2016-9-15
 *
 */
public class ListTest
{

	/**
	 * Testing the updateList method
	 */
	@Test
	public void positiveList()
	{
		final List<Integer> numbers = Arrays.asList(4, 7, 2, -2, 8, -5, -7);
		final List<Integer> expected = Arrays.asList(4, 7, 2, 2, 8, 5, 7);

		final List<Integer> actual = Lists.updateList(numbers,
				new IntegerOperation()
				{
					@Override
					public Integer performOperation(Integer value)
					{
						return Math.abs(value);
					}
				});

		assertEquals(expected, actual);
	}

	@Test
	public void stringLengths()
	{
		final List<String> strings = Arrays.asList("java", "programming",
				"interviews", "exposed");
		final List<Integer> expected = Arrays.asList(4, 11, 10, 7);
		final List<Integer> actual = Lists.mapList(strings,
				new StringLengthOperation());
		assertEquals(expected, actual);
	}
}
