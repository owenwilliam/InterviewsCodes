package com.owen.javabasics.chapter08;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * 
 * @author OwenWilliam  2016-9-16
 *
 */
public class OtherTest
{
	/**
	 * Treating arrays as objects (I)
	 */
	@Test
	public void arraysAsObjects()
	{
		Map<String, Object> mapping = new HashMap<>();
		mapping.put("key", new int[] { 0, 1, 2, 3, 4, 5 });
		assertTrue(mapping.get("key") instanceof int[]);
	}

	/**
	 * Treating arrays as objects (II)
	 */
	@Test
	public void arrayReferences()
	{
		final int[] myArray = new int[] { 0, 1, 2, 3, 4, 5 };
		int[] arrayReference2 = myArray;
		arrayReference2[5] = 99;
		assertFalse(myArray[5] == 5);
	}
	
	
}
