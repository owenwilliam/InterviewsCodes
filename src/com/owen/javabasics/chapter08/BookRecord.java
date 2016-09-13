package com.owen.javabasics.chapter08;

/**
 * An almost-immutable class
 * 
 * @author OwenWilliam  2016-9-16
 *
 */
public final class BookRecord
{

	private String author;
	private String bookTitle;

	public BookRecord(String author, String bookTitle)
	{
		this.author = author;
		this.bookTitle = bookTitle;
	}

	public String getAuthor()
	{
		return author;
	}

	public String getBookTitle()
	{
		return bookTitle;
	}

}