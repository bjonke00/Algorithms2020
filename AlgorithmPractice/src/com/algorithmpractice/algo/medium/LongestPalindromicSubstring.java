package com.algorithmpractice.algo.medium;

public class LongestPalindromicSubstring {

    //Treat every char as the potential center of palindrome (aka odd chars)
    //And treat every char + nextChar as the potential center of palindrome (aka even chars)
    //Eliminating extra looping
    //time O(n^2) | space O(1)
    public static String longestPalindromicSubstring(String str) {
        int[] longestPalSubstrIndices = {0,1};

        for(int i=1; i<str.length(); i++){
            int[] odd  = getLongestPalindrome(i-1, i+1, str);
            int[] even = getLongestPalindrome(i-1, i, str);
            int[] longer = odd[1]-odd[0] > even[1]-even[0] ? odd : even;
            longestPalSubstrIndices = longer[1]-longer[0] > longestPalSubstrIndices[1]-longestPalSubstrIndices[0] ? longer : longestPalSubstrIndices;
        }

        return str.substring(longestPalSubstrIndices[0], longestPalSubstrIndices[1]);
    }

    private static int[] getLongestPalindrome(int leftIdx, int rightIdx, String str){
        while(leftIdx >= 0 && rightIdx < str.length()){
            if(str.charAt(leftIdx) != str.charAt(rightIdx)){
                break;
            }
            leftIdx--;
            rightIdx++;
        }
        return new int[]{leftIdx + 1, rightIdx};
    }

    //////////////////////////////////original solution//////////////////////////////////////////

    //time O(n^3) | space O(1)
    public static String longestPalindromicSubstring_basic(String str) {
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
