package com.algorithmpractice.leetcode.easy;

public class MaxProfit {
    //time O(n) space O(1)
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for(int i=1; i<prices.length; i++){
            if(prices[i] > prices[i-1]){
                maxProfit += prices[i] - prices[i-1];
            }
        }

        return maxProfit;
    }

    //time O(n) space O(1)
    public int maxProfit1(int[] prices) {
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];
            maxprofit += peak - valley;
        }
        return maxprofit;
    }
}
