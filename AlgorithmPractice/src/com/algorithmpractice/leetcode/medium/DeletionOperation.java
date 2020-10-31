package com.algorithmpractice.leetcode.medium;

public class DeletionOperation {

    //O(m*n) time and space
    public int minDistanceDynamicApproach(String word1, String word2) {
        int dp[][] = new int[word1.length() + 1][word2.length() + 1];

        for(int row = 0; row < dp.length; row++){
            for(int col = 0; col < dp[0].length; col++){
                if(row == 0 || col == 0){
                    dp[row][col] = row + col;
                }else if (word1.charAt(row - 1) != word2.charAt(col - 1)){
                    dp[row][col] = Math.min(dp[row - 1][col], dp[row][col - 1]) + 1;
                }else{
                    dp[row][col] = dp[row - 1][col - 1];
                }
            }
        }

        return dp[word1.length()][word2.length()];
    }
}
