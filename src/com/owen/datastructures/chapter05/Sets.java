package com.owen.datastructures.chapter05;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Set
 * 
 * @author OwenWilliam  2016-9-15
 *
 */
public class Sets
{

	@Test
	public void setExample()
	{
		final Set<String> set = new HashSet<>();
		set.add("hello");
		set.add("welcome");
		set.add("goodbye");
		set.add("bye");
		set.add("hello");

		assertEquals(4, set.size());
	}
}
