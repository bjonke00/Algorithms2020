package com.algorithmpractice.algo.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeLargestNumbersTest{
        @Test
        public void TestCase1() {
            ThreeLargestNumbers t = new ThreeLargestNumbers();
            int[] expected = {18, 141, 541};
            assertTrue(
                    compare(
                            t.findThreeLargestNumbers(new int[] {141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7}),
                            expected));
        }

        public boolean compare(int[] arr1, int[] arr2) {
            if (arr1.length != arr2.length) {
                return false;
            }
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
            return true;
        }
}