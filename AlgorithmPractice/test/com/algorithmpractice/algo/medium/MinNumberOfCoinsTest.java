package com.algorithmpractice.algo.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinNumberOfCoinsTest {
    @Test
    public void TestCase1() {
        MinNumberOfCoins minNumberOfCoins = new MinNumberOfCoins();
        int[] input = {1, 5, 10};
        assertEquals(3, minNumberOfCoins.minNumberOfCoinsForChange(7, input));
    }
}