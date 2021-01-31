package com.algorithmpractice.algo.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinNumberOfCoinsTest {
    @Test
    public void TestCase1() {
        int[] coins = {1, 5, 10};
        int amount = 7;
        assertEquals(3, MinNumberOfCoins.findMinCoinChange(coins, amount));
        assertEquals(3, MinNumberOfCoins.minNumberOfCoinsForChange(amount, coins));
    }

    @Test
    public void TestCase2() {
        int[] coins = {1, 2, 5};
        int amount = 11;
        assertEquals(3, MinNumberOfCoins.findMinCoinChange(coins, amount));
        assertEquals(3, MinNumberOfCoins.minNumberOfCoinsForChange(amount, coins));
    }

    @Test
    public void TestCase3_coin_greater_than_amount() {
        int[] coins = {3};
        int amount = 2;
        assertEquals(-1, MinNumberOfCoins.findMinCoinChange(coins, amount));
        assertEquals(-1, MinNumberOfCoins.minNumberOfCoinsForChange(amount, coins));
    }
}