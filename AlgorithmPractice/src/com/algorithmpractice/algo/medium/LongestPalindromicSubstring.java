package com.algorithmpractice.algo.medium;

public class LongestPalindromicSubstring {
    //time O(n^3) | space O(1)
    public static String longestPalindromicSubstring(String str) {
        String longestPalindromicSubstr = "";
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            for (int j = sb.length(); j > i; j--) {
                String currentStr = sb.substring(i, j);
                if (isPalindrome(currentStr) && currentStr.length() > longestPalindromicSubstr.length()) {
                    longestPalindromicSubstr = currentStr;
                }
            }
        }
        return longestPalindromicSubstr;
    }

    private static boolean isPalindrome(String str) {
        int rightIdx = str.length() - 1;
        for (int leftIdx = 0; leftIdx < str.length(); leftIdx++) {
            if (str.charAt(leftIdx) != str.charAt(rightIdx)) {
                return false;
            }
            rightIdx--;
        }
        return true;
    }

}
