package com.owen.datastructures.chapter05.complextree;

/**
 * interface
 * 
 * @author OwenWilliam  2016-9-15
 *
 * @param <E>
 */
public interface Tree<E extends Comparable>
{
	boolean search(E toFind);

	void insert(E toInsert);
}
