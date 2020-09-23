package com.algorithmpractice.algo.arrays.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinRewardsTest {
    @Test
    public void TestCase1() {
        assertTrue(MinRewards.minRewards(new int[] {8, 4, 2, 1, 3, 6, 7, 9, 5}) == 25);
    }

    @Test
    public void TestCase2() {
        assertTrue(MinRewards.minRewards(new int[] {0, 4, 2, 1, 3}) == 9);
    }
}