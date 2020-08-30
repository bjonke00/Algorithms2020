package com.algorithmpractice.algo.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromicSubstringTest {

    @Test
    public void TestCase1() {
        LongestPalindromicSubstring longestPalSubstr = new LongestPalindromicSubstring();
        assertTrue(longestPalSubstr.longestPalindromicSubstring("abaxyzzyxf").equals("xyzzyx"));
        assertTrue(longestPalSubstr.longestPalindromicSubstring_basic("abaxyzzyxf").equals("xyzzyx"));
    }

}