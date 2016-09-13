package com.owen.despattern.chapter06.template;

/**
 * 
 * @author OwenWilliam  2016-9-15
 *
 */
public class StackImp implements StackPredicate
{

	@Override
	public boolean isValid(int i)
	{
		// TODO Auto-generated method stub
		return  (i % 2 == 0);
	}

}
