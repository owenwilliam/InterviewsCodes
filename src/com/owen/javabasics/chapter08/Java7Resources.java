package com.owen.javabasics.chapter08;

import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author OwenWilliam 2016-9-16
 *
 */
public class Java7Resources
{

	@Test
	public void demonstrateResourceHandling()
	{
		try (final FileReader reader = new FileReader("/tmp/dataFile"))
		{
			final char[] buffer = new char[128];
			reader.read(buffer);
		} catch (IOException e)
		{
			// .. deal with exception
		}
	}
}
