package com.algorithmpractice.algo.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSortTest {
    @Test
    public void TestCase1() {
        SelectionSort s = new SelectionSort();
        int[] expected = {2, 3, 5, 5, 6, 8, 9};
        int[] input = {8, 5, 2, 9, 5, 6, 3};
        assertTrue(compare(s.selectionSort(input), expected));
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