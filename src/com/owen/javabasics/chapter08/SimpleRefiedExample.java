package com.owen.javabasics.chapter08;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * A simple use of generics
 * 
 * @author OwenWilliam 2016-9-16
 *
 */
public class SimpleRefiedExample
{

	public void genericTypesCheck()
	{
		List<String> strings = new ArrayList<String>();
		strings.add("Die Hard 4.0");
		strings.add("Terminator 3");
		strings.add("Under Siege 2");

		System.out.println(strings.get(2) instanceof String);
	}

	@Test
	public void genericTypesCheck1()
	{
		ArrayList arraylist = new ArrayList();
		arraylist.add("Die Hard 4.0");
		arraylist.add("Terminator 3");
		arraylist.add("Under Siege 2");
		System.out.println(arraylist.get(2) instanceof String);
	}
}
