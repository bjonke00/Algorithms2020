package com.algorithmpractice.algo.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithoutDuplicatesTest {

    @Test
    public void TestCase1() {
        LongestSubstringWithoutDuplicates l = new LongestSubstringWithoutDuplicates();
        assertTrue(l.longestSubstringWithoutDuplication("codingisreallyfun").equals("ngisreal"));
    }
}