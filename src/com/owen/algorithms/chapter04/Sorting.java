package com.owen.algorithms.chapter04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertArrayEquals;

/**
 * What is the difference between the Comparable and Comparator interfaces?
 * 
 * @author OwenWilliam
 *
 */
public class Sorting
{

	/**
	 * Naturally sorting an array of ints
	 */
	@Test
	public void sortInts()
	{
		final int[] numbers = { -3, -5, 1, 7, 4, -2 };
		final int[] expected = { -5, -3, -2, 1, 4, 7 };

		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}

	/**
	 * Sorting objects naturally
	 */
	@Test
	public void sortObjects()
	{
		final String[] strings = { "z", "x", "y", "abc", "zzz", "zazzy" };
		final String[] expected = { "abc", "x", "y", "z", "zazzy", "zzz" };

		Arrays.sort(strings);
		assertArrayEquals(expected, strings);
	}

	private static class NotComparable
	{
		private int i;

		private NotComparable(final int i)
		{
			this.i = i;
		}
	}

	/**
	 * Sorting without a Comparable interface
	 */
	@Test
	public void sortNotComparable()
	{
		final List<NotComparable> objects = new ArrayList<>();
		for (int i = 0; i < 10; i++)
		{
			objects.add(new NotComparable(i));
		}

		try
		{
			Arrays.sort(objects.toArray());
		} catch (Exception e)
		{
			// correct behavior ¨C cannot sort
			return;
		}

		fail();
	}

	/**
	 * Using a custom ordering
	 */
	@Test
	public void customSorting()
	{
		final List<Integer> numbers = Arrays.asList(4, 7, 1, 6, 3, 5, 4);
		final List<Integer> expected = Arrays.asList(7, 6, 5, 4, 4, 3, 1);

		Collections.sort(numbers, new ReverseNumericalOrder());
		assertEquals(expected, numbers);
	}
}
