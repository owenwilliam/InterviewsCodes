package com.owen.datastructures.chapter05;

/**
 * A sample LinkedList  
 * 
 * @author OwenWilliam  2016-9-15
 *
 * @param <E>
 */
public class SimpleLinkedList<E>
{
	private static class Element<E>
	{
		E value;
		Element<E> next;
	}

	private Element<E> head;
}
