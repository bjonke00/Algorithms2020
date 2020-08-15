package com.algorithmpractice.algo.medium;

public class WaysToMakeChange {
    //time nm space n
    public int numberOfWaysToMakeChange(int n, int[] denoms) {
        int ways[] = new int[n+1];
        ways[0] = 1;
        for(int denom : denoms){
            for(int i=1; i<=n; i++){
                if(denom <= i){
                    ways[i] += ways[i - denom];
                }
            }
        }

        return ways[n];
    }
}
