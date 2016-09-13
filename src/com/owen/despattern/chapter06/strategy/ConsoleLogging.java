package com.owen.despattern.chapter06.strategy;

/**
 * Implementing a logger with the Strategy Pattern
 * 
 * @author OwenWilliam 2016-9-15
 *
 */
public class ConsoleLogging implements Logging
{
	@Override
	public void write(final String message)
	{
		System.out.println(message);
	}
}
