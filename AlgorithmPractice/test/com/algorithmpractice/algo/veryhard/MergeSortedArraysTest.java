package com.algorithmpractice.algo.veryhard;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MergeSortedArraysTest {
    @Test
    public void TestCase1() {
        MergeSortedArrays msa = new MergeSortedArrays();
        List<List<Integer>> arrays = new ArrayList<List<Integer>>();
        arrays.add(Arrays.asList(new Integer[]{1, 5, 9, 21}));
        arrays.add(Arrays.asList(new Integer[]{-1, 0}));
        arrays.add(Arrays.asList(new Integer[]{-124, 81, 121}));
        arrays.add(Arrays.asList(new Integer[]{3, 6, 12, 20, 150}));
        List<Integer> actual = msa.mergeSortedArrays(arrays);
        List<Integer> expected =
                Arrays.asList(new Integer[]{-124, -1, 0, 1, 3, 5, 6, 9, 12, 20, 21, 81, 121, 150});
        assertEquals(expected, actual);
    }
}