package com.algorithmpractice.algo.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {
    @Test
    public void TestCase1() {
        TwoSum ts = new TwoSum();
        int[] output = ts.twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
        assertTrue(output.length == 2);
        assertTrue(contains(output, -1));
        assertTrue(contains(output, 11));
    }

    @Test
    public void TestCase2() {
        TwoSum ts = new TwoSum();
        int[] output = ts.twoNumberSum(new int[] {3}, 4);
        assertTrue(output.length == 0);
    }

    public boolean contains(int[] output, int val) {
        for (int el : output) {
            if (el == val) return true;
        }
        return false;
    }
}