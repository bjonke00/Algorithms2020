package com.algorithmpractice.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstUniqueCharacterInStringTest {

	private FirstUniqueCharacterInString firstUniqueCharacterInString = new FirstUniqueCharacterInString();
	
	@Test
	public void test1() {
		assertEquals(0, firstUniqueCharacterInString.findFirstUniqueCharacter("leetcode"));
	}

	@Test
	public void test2() {
		assertEquals(2, firstUniqueCharacterInString.findFirstUniqueCharacter("loveleetcode"));
	}
}
