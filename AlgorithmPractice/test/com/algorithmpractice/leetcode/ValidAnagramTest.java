package com.algorithmpractice.leetcode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidAnagramTest {

	ValidAnagram validAnagram = new ValidAnagram();
	@Test
	public void test1() {
		String str1 = "anagram";
		String str2 = "nagaram";
		assertTrue(validAnagram.isValidAnagram(str1,str2));
	}

	@Test
	public void test2() {
		String str1 = "rat";
		String str2 = "car";
		assertFalse(validAnagram.isValidAnagram(str1,str2));
	}
}
