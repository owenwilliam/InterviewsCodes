package com.owen.popualgorithms.chapter07;

/**
 * 
 * @author OwenWilliam 2016-9-15
 *
 */
public class StringLengthOperation implements GenericOperation<String, Integer>
{
	@Override
	public Integer performOperation(String value)
	{
		return value.length();
	}
}
