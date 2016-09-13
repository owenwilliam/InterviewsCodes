package com.owen.popualgorithms.chapter07;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * 
 * @author OwenWilliam 2016-9-15
 *
 */
public class StringsTest
{

	@Test
	public void reverse()
	{
		final String s = "Hello";
		assertEquals("olleH", Strings.reverse(s));
	}

	@Test
	public void reverseInPlace()
	{
		final String s = "Hello";
		assertEquals("olleH", Strings.inPlaceReverse(s));
	}

	@Test
	public void palindromeCheck()
	{
		assertTrue(Strings.isPalindrome("eve"));
		assertTrue(Strings.isPalindrome("level"));
		assertTrue(Strings.isPalindrome("Top spot"));
		assertFalse(Strings.isPalindrome("not a palindrome"));
	}
}
