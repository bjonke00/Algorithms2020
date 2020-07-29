package com.algorithmpractice.algo.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxNonAdjacentSumsTest {

    @Test
    public void TestCase1() {
        MaxNonAdjacentSums m = new MaxNonAdjacentSums();
        int[] input = {75, 105, 120, 75, 90, 135};
        assertTrue(m.maxSubsetSumNoAdjacent(input) == 330);
    }

}