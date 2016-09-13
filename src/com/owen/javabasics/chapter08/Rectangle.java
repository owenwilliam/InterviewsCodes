package com.owen.javabasics.chapter08;

/**
 * Creating shapes using inheritance
 * 
 * @author OwenWilliam  2016-9-15
 *
 */
public class Rectangle
{

	private final int width;
	private final int height;

	public Rectangle(final int width, final int height)
	{
		this.width = width;
		this.height = height;
	}

	public int area()
	{
		return width * height;
	}
}
