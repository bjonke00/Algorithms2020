package com.algorithmpractice.algo.medium;

import java.util.Arrays;

public class MinNumberOfCoins {
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
