package com.algorithmpractice.algo.arrays.extreme;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LongestIncreasingSubsequenceTest {
    @Test
    public void TestCase1() {
        int[] expected = {-24, 2, 3, 5, 6, 35};
        assertTrue(
                compare(
                        LongestIncreasingSubsequence.longestIncreasingSubsequence(new int[]{5, 7, -24, 12, 10, 2, 3, 12, 5, 6, 35}),
                        expected));
    }

    @Test
    public void TestCase2() {
        int[] expected = {-1, 2};
        assertTrue(
                compare(
                        LongestIncreasingSubsequence.longestIncreasingSubsequence(new int[]{-1, 2}),
                        expected));
    }

    @Test
    public void TestCase3() {
        int[] expected = {1, 2, 3};
        assertTrue(
                compare(
                        LongestIncreasingSubsequence.longestIncreasingSubsequence(new int[]{1, 2, -1, 3}),
                        expected));
    }

    public static boolean compare(List<Integer> arr1, int[] arr2) {
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