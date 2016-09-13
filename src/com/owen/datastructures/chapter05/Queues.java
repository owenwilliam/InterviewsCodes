package com.owen.datastructures.chapter05;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.Assert.assertEquals;

/**
 * What is a Queue and Deque?
 * 
 * @author OwenWilliam  2016-9-15
 *
 */
public class Queues
{

	@Test
	public void queueInsertion()
	{
		final Queue<String> queue = new LinkedList<>();
		queue.add("first");
		queue.add("second");
		queue.add("third");

		assertEquals("first", queue.remove());
		assertEquals("second", queue.remove());
		assertEquals("third", queue.peek());
		assertEquals("third", queue.remove());
	}
}
