package com.algorithmpractice.leetcode;

public class ClimbStairs {

    //dynamic bottom-up approach O(n) time and space
    public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i < n + 1; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    
}
