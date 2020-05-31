package com.algorithmpractice.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseIntegerTest {

	ReverseInteger reverseInteger = new ReverseInteger();
	
	@Test
	public void test1() {
		int expectedReversedInt = 321;
		int reverseInt = reverseInteger.reverseInteger(123);
		assertEquals(expectedReversedInt, reverseInt);
	}

	@Test
	public void test2() {
		int expectedReversedInt = -321;
		int reverseInt = reverseInteger.reverseInteger(-123);
		assertEquals(expectedReversedInt, reverseInt);
	}
	
	@Test
	public void test3() {
		int expectedReversedInt = 21;
		int reverseInt = reverseInteger.reverseInteger(120);
		assertEquals(expectedReversedInt, reverseInt);
	}
}
