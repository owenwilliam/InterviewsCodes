package com.owen.despattern.chapter06.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test
 * 
 * @author OwenWilliam  2016-9-15
 *
 */
public class LibraryBookTest
{

	@Test
	public void fictionLibraryBook()
	{
		final LibraryBook.Builder builder = new LibraryBook.Builder();
		final LibraryBook book = builder.withBookName("War and Peace").build();

		assertEquals(BookType.FICTION, book.getBookType());
	}
}
