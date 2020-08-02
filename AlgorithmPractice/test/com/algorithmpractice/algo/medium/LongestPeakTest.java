package com.algorithmpractice.algo.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPeakTest {
    @Test
    public void TestCase1() {
        LongestPeak lp = new LongestPeak();
        int[] input = new int[] {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        int expected = 6;
        int actual = lp.findLengthOflongestPeak(input);
        assertTrue(expected == actual);
    }
}