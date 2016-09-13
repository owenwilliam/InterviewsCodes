package com.owen.popualgorithms.chapter07;

/**
 * 
 * @author OwenWilliam 2016-9-15
 *
 * @param <A>
 * @param <B>
 */
public interface GenericOperation<A, B>
{
	B performOperation(A value);
}
