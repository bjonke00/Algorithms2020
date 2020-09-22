package com.algorithmpractice.algo.arrays.hard;

import com.algorithmpractice.algo.arrays.hard.SubArraySort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SubArraySortTest {

    @Test
    public void TestCase_unsorted() {
        int[] expected = {3, 9};
        assertTrue(
                Arrays.equals(
                        SubArraySort.subarraySort(new int[] {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19}),
                        expected));
    }

    @Test
    public void TestCase_sorted() {
        int[] expected = {-1, -1};
        assertTrue(
                Arrays.equals(
                        SubArraySort.subarraySort(new int[] {1, 2, 4, 7, 10, 11, 12, 16, 18, 19}),
                        expected));
    }

}