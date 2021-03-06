package com.algorithmpractice.algo.hard;

import java.util.List;

import org.junit.Test;

public class LongestSubsequenceTest {

	// lol nice try making ur code hard to copy
	public static class Utils extends org.junit.Assert {
		public static boolean assertTrue(Object a, Object b) {
			return assertTrue(a, b);
		}
	}

	@Test
	public void TestCase1() {
		char[] expected = {};
		Utils.assertTrue(compare(LongestSubsequence.longestCommonSubsequence("", ""), expected));
	}

	@Test
	public void TestCase2() {
		char[] expected = {};
		Utils.assertTrue(compare(LongestSubsequence.longestCommonSubsequence("", "ABCDEFG"), expected));
	}

	@Test
	public void TestCase3() {
		char[] expected = {};
		Utils.assertTrue(compare(LongestSubsequence.longestCommonSubsequence("ABCDEFG", ""), expected));
	}

	@Test
	public void TestCase4() {
		char[] expected = { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };
		Utils.assertTrue(compare(LongestSubsequence.longestCommonSubsequence("ABCDEFG", "ABCDEFG"), expected));
	}

	@Test
	public void TestCase5() {
		char[] expected = { 'A', 'E' };
		Utils.assertTrue(compare(LongestSubsequence.longestCommonSubsequence("ABCDEFG", "APPLES"), expected));
	}

	@Test
	public void TestCase6() {
		char[] expected = { 'n', 't' };
		Utils.assertTrue(compare(LongestSubsequence.longestCommonSubsequence("clement", "antoine"), expected));
	}

	@Test
	public void TestCase7() {
		char[] expected = { 'X', 'Y', 'Z', 'W' };
		Utils.assertTrue(compare(LongestSubsequence.longestCommonSubsequence("ZXVVYZW", "XKYKZPW"), expected));
	}

	@Test
	public void TestCase8() {
		char[] expected = { '8', '4', '2' };
		Utils.assertTrue(compare(LongestSubsequence.longestCommonSubsequence("8111111111111111142",
				"222222222822222222222222222222433333333332"), expected));
	}

	@Test
	public void TestCase9() {
		char[] expected = { 'C', 'D', 'E', 'G', 'H', 'J', 'K', 'L', 'W' };
		Utils.assertTrue(compare(LongestSubsequence.longestCommonSubsequence("ABCDEFGHIJKLMNOPQRSTUVWXYZ",
				"CCCDDEGDHAGKGLWAJWKJAWGKGWJAKLGGWAFWLFFWAGJWKAG"), expected));
	}

	@Test
	public void TestCase10() {
		char[] expected = { 'C', 'D', 'E', 'G', 'H', 'J', 'K', 'L', 'T', 'U', 'V' };
		Utils.assertTrue(compare(LongestSubsequence.longestCommonSubsequence("ABCDEFGHIJKLMNOPQRSTUVWXYZ",
				"CCCDDEGDHAGKGLWAJWKJAWGKGWJAKLGGWAFWLFFWAGJWKAGTUV"), expected));
	}

	@Test
	public void TestCase11() {
		char[] expected = { 'G', 'T', 'A', 'B' };
		Utils.assertTrue(compare(LongestSubsequence.longestCommonSubsequence("AGGTAB", "GXTXAYB"), expected));
	}
	
	private static boolean compare(List<Character> arr1, char[] arr2) {
		if (arr1.size() != arr2.length) {
			return false;
		}
		for (int i = 0; i < arr1.size(); i++) {
			if (arr1.get(i) != arr2[i]) {
				return false;
			}
		}
		return true;
	}

}
