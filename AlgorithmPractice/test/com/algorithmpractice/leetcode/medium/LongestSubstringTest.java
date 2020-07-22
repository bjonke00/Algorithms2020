package com.algorithmpractice.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringTest {

    @Test
    public void test(){
        LongestSubstring longestSubstring = new LongestSubstring();
        assertEquals(3, longestSubstring.lengthOfLongestSubstring("abcbb"));
    }

    @Test
    public void test0(){
        LongestSubstring longestSubstring = new LongestSubstring();
        assertEquals(3, longestSubstring.lengthOfLongestSubstring("dvdf"));
    }

    @Test
    public void test1(){
        LongestSubstring longestSubstring = new LongestSubstring();
        assertEquals(1, longestSubstring.lengthOfLongestSubstring(" "));
    }

    @Test
    public void test2(){
        LongestSubstring longestSubstring = new LongestSubstring();
        assertEquals(2, longestSubstring.lengthOfLongestSubstring("au"));
    }

    @Test
    public void test3(){
        LongestSubstring longestSubstring = new LongestSubstring();
        assertEquals(1, longestSubstring.lengthOfLongestSubstring("aa"));
    }

}