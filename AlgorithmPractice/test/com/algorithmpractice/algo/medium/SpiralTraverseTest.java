package com.algorithmpractice.algo.medium;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SpiralTraverseTest {
    @Test
    public void TestCase1() {
        SpiralTraverse st = new SpiralTraverse();
        int[][] input =
                new int[][] {
                        {1, 2, 3, 4},
                        {12, 13, 14, 5},
                        {11, 16, 15, 6},
                        {10, 9, 8, 7},
                };
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        List<Integer> actual = st.spiralTraverse(input);
        assertTrue(expected.equals(actual));
    }
}