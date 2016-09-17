package com.owen.concurrency.chapter11;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 
 * @author OwenWilliam
 *
 */
public class AtomicCounter
{

	private final AtomicInteger number = new AtomicInteger(0);

	public AtomicInteger getNumber()
	{
		return number;
	}
}
