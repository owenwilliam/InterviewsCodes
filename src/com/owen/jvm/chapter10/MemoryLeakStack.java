package com.owen.jvm.chapter10;

import java.util.ArrayList;
import java.util.List;

/**
 * A collection with a memory leak
 * 
 * @author OwenWilliam 2016-9-16
 *
 * @param <E>
 */
public class MemoryLeakStack<E>
{

	private final List<E> stackValues;
	private int stackPointer;

	public MemoryLeakStack()
	{
		this.stackValues = new ArrayList<>();
		stackPointer = 0;
	}

	public void push(E element)
	{
		stackValues.add(stackPointer, element);
		stackPointer++;
	}

	public E pop()
	{
		stackPointer--;
		return stackValues.get(stackPointer);
	}
}
