package com.owen.jvm.chapter10;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/**
 * A stack implementation with WeakReference objects
 * 
 * @author OwenWilliam 2016-9-16
 *
 * @param <E>
 */
public class WeakReferenceStack<E>
{

	private final List<WeakReference<E>> stackReferences;
	private int stackPointer = 0;

	public WeakReferenceStack()
	{
		this.stackReferences = new ArrayList<>();
	}

	public void push(E element)
	{
		this.stackReferences.add(stackPointer, new WeakReference<>(element));
		stackPointer++;
	}

	public E pop()
	{
		stackPointer--;
		return this.stackReferences.get(stackPointer).get();
	}

	public E peek()
	{
		return this.stackReferences.get(stackPointer - 1).get();
	}
}
