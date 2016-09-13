package com.owen.concurrency.chapter11;

/**
 * 
 * @author OwenWilliam 2016-9-17
 *
 */
public class Threads
{

	public static void main(String[] args) throws InterruptedException
	{

		final Thread separateThread = new Thread(new ThreadPrinter());
		separateThread.start();
		for (int i = 0; i < 5; i++)
		{
			System.out.println("From the main thread: "
					+ Thread.currentThread().getName());
			Thread.sleep(1000);
		}
	}
}
