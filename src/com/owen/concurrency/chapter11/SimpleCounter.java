package com.owen.concurrency.chapter11;

/**
 * 
 * @author OwenWilliam 2016-9-17
 *
 */
public class SimpleCounter
{

	private int number = 0;

	public void setNumber(int number)
	{
		this.number = number;
	}

	public int getNumber()
	{
		return number;
	}
}