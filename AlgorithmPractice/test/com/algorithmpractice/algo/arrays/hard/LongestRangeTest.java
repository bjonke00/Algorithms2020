package com.algorithmpractice.algo.arrays.hard;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LongestRangeTest {
    @Test
    public void TestCase1() {
        int[] expected = {0, 7};
        assertTrue(
                Arrays.equals(
                        LongestRange.largestRange(new int[] {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6}), expected));
    }

    @Test
    public void TestCase_one() {
        int[] expected = {1, 1};
        assertTrue(
                Arrays.equals(
                        LongestRange.largestRange(new int[] {1}), expected));
    }

    @Test
    public void TestCase_negative() {
        int[] expected = {-11, -5};
        assertTrue(
                Arrays.equals(
                        LongestRange.largestRange(new int[] {1, 3, 4, 5, 2, -11, -5, -6, -10, -7, -8, -9}), expected));
    }
}