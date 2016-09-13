package com.owen.popualgorithms.chapter07;

/**
 * 
 * @author OwenWilliam 2016-9-15
 *
 */
public class AddOneOperation implements IntegerOperation
{
	@Override
	public Integer performOperation(Integer value)
	{
		return value + 1;
	}
}
