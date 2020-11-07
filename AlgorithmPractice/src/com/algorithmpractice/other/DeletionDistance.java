package com.algorithmpractice.other;

public class DeletionDistance {
    static int deletionDistance(String str1, String str2) {
        int lcs = getLcs(str1, str2);
        return (str1.length() + str2.length()) - 2 * lcs;
    }

    static int getLcs(String str1, String str2) {
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];

        for (int row = 1; row < str1.length() + 1; row++) {
            for (int col = 1; col < str2.length() + 1; col++) {
                if (str1.charAt(row - 1) == str2.charAt(col - 1)) {
                    dp[row][col] = dp[row - 1][col - 1] + 1;
                } else {
                    dp[row][col] = Math.max(dp[row - 1][col], dp[row][col - 1]);
                }
            }
        }

        return dp[str1.length()][str2.length()];
    }

  /*
    ''h i t
  ''0 0 0 0
  h 0 1 1 1
  e 0 1 1 1
  a 0 1 1 1
  t 0 1 1 2

  find the longest common subsequence
  for dog and frog it would be og
  then add the lengths of dog and frog and subtract 2 * the lcs
  O(n*m) time and space
  */
}
