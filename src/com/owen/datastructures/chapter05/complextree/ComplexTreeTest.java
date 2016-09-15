package com.owen.datastructures.chapter05.complextree;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Test
 * 
 * @author OwenWilliam 2016-9-15
 *
 */
public class ComplexTreeTest
{

	@Test
	public void insert()
	{
		final Node<Integer> root = new Node<>(7, null, null);
		root.setLeft(new Leaf<>(root));
		root.setRight(new Leaf<>(root));

		root.insert(3);
		assertTrue(root.search(3));
		assertFalse(root.search(13));
	}
}
