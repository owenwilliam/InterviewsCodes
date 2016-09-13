package com.owen.popualgorithms.chapter07;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a method that replicates a list of Integers, with 1 added to each
 * element.
 * 
 * @author OwenWilliam
 *
 */
public class Lists
{

	/**
	 * Adding one to a list of numbers
	 * 
	 * @param numbers
	 * @return
	 */
	public static List<Integer> addOne(final List<Integer> numbers)
	{
		final ArrayList<Integer> toReturn = new ArrayList<>(numbers.size());
		for (final Integer number : numbers)
		{
			toReturn.add(number + 1);
		}

		return toReturn;
	}

	/**
	 * Performing any Integer operation on a list
	 * 
	 * @param numbers
	 * @param op
	 * @return
	 */
	public static List<Integer> updateList(final List<Integer> numbers,
			final IntegerOperation op)
	{
		final ArrayList<Integer> toReturn = new ArrayList<>(numbers.size());
		for (final Integer number : numbers)
		{
			toReturn.add(op.performOperation(number));
		}

		return toReturn;
	}

	/**
	 * Mapping a list into a different type
	 * 
	 * @param values
	 * @param op
	 * @return
	 */
	public static <A, B> List<B> mapList(final List<A> values,
			final GenericOperation<A, B> op)
	{
		final ArrayList<B> toReturn = new ArrayList<>(values.size());
		for (final A a : values)
		{
			toReturn.add(op.performOperation(a));
		}

		return toReturn;
	}
}
