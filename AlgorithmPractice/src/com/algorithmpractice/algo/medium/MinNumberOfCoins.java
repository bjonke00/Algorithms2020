package com.algorithmpractice.algo.medium;

import java.util.Arrays;

public class MinNumberOfCoins {

    //O(a * n) where a is the amount and n is the number of coins
    //O(a) where n is the amount + 1
    public static int findMinCoinChange(int[] coins, int amount) {
        int [] minCoins = new int[amount + 1];
        Arrays.fill(minCoins, amount + 1);
        minCoins[0] = 0;

        for(int i = 1; i < amount + 1; i++){
            for(int coin : coins){
                if(coin <= i){
                    minCoins[i] = Math.min(minCoins[i - coin] + 1, minCoins[i]);
                }
            }
        }

        return minCoins[amount] > amount ? -1 : minCoins[amount];
    }

    //time (nm) space(n)
    public static int minNumberOfCoinsForChange(int n, int[] denoms) {
        int[] numOfCoins = new int[n + 1];
        Arrays.fill(numOfCoins, Integer.MAX_VALUE);
        numOfCoins[0] = 0;
        int toCompare = 0;
        for (int denom : denoms) {
            for (int amount = 1; amount <= n; amount++) {
                if (denom <= amount) {
                    int diff = amount - denom;
                    if (numOfCoins[diff] == Integer.MAX_VALUE) {
                        toCompare = numOfCoins[diff];
                    } else {
                        toCompare = numOfCoins[diff] + 1;
                    }
                    numOfCoins[amount] = Math.min(numOfCoins[amount], toCompare);
                }
            }
        }
        return numOfCoins[n] != Integer.MAX_VALUE ? numOfCoins[n] : -1;
    }
}
