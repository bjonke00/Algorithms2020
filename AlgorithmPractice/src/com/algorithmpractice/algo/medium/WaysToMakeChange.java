package com.algorithmpractice.algo.medium;

public class WaysToMakeChange {
    //time nm space n
    public int numberOfWaysToMakeChange(int n, int[] denoms) {
        int ways[] = new int[n+1];
        ways[0] = 1;
        for(int denom : denoms){
            for(int amount=1; amount<=n; amount++){
                if(denom <= amount){
                    ways[amount] += ways[amount - denom];
                }
            }
        }

        return ways[n];
    }
}
