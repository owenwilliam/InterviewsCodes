package com.owen.popualgorithms.chapter07;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Write an algorithm that prints all numbers between 1 and n, replacing
 * multiples of 3 with the String Fizz, multiples of 5 with Buzz, and multiples
 * of 15 with FizzBuzz.
 * 
 * @author OwenWilliam 2016-9-15
 *
 */
public class FizzBuzz
{

	/**
	 * A simple implementation of the ¡°FizzBuzz¡± interview question
	 * 
	 * @param n
	 * @return
	 */
	public static List<String> fizzBuzz(final int n)
	{
		final List<String> toReturn = new ArrayList<>(n);
		for (int i = 1; i <= n; i++)
		{
			if (i % 15 == 0)
			{
				toReturn.add("FizzBuzz");
			} else if (i % 3 == 0)
			{
				toReturn.add("Fizz");
			} else if (i % 5 == 0)
			{
				toReturn.add("Buzz");
			} else
			{
				toReturn.add(Integer.toString(i));
			}
		}

		return toReturn;
	}

	/**
	 * Abstraction with FizzBuzz
	 * 
	 * @param n
	 * @return
	 */
	public static List<String> alternativeFizzBuzz(final int n)
	{
		final List<String> toReturn = new ArrayList<>(n);
		for (int i = 1; i <= n; i++)
		{
			final String word = toWord(3, i, "Fizz") + toWord(5, i, "Buzz");

			if (StringUtils.isEmpty(word))
			{
				toReturn.add(Integer.toString(i));
			} else
			{
				toReturn.add(word);
			}
		}
		return toReturn;
	}

	private static String toWord(final int divisor, final int value,
			final String word)
	{
		return value % divisor == 0 ? word : "";
	}
}
