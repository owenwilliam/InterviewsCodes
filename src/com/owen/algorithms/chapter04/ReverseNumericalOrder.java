package com.owen.algorithms.chapter04;

import java.util.Comparator;

/**
 * A reverse numerical order Comparator
 * 4, 7, 1, 6, 3, 5, 4
 * @author OwenWilliam
 *
 */
public class ReverseNumericalOrder implements Comparator<Integer>
{
	@Override
	public int compare(Integer o1, Integer o2)
	{
		return o2 - o1;
	}
	// equals omitted
}
