package com.owen.javabasics.chapter08;

import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;

/**
 * mutateBookRecordState
 * 
 * @author OwenWilliam  2016-9-16
 *
 */
public class BookRecordReflectionTest
{

	@Test
	public void mutateBookRecordState() throws NoSuchFieldException,
			IllegalAccessException
	{
		final BookRecord record = new BookRecord("Suzanne Collins",
				"The Hunger Games");

		final Field author = record.getClass().getDeclaredField("author");
		author.setAccessible(true);
		author.set(record, "Catching Fire");

		assertEquals("Catching Fire", record.getAuthor());
	}
}
