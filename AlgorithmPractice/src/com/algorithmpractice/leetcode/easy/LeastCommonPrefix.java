package com.algorithmpractice.leetcode.easy;

public class LeastCommonPrefix {
    //O(n*m) where n is the first string and m is the number of strings
    //space is O(n) store at most the length of the smallest string
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }

        int index = 0;
        StringBuilder leastCommonPrefix = new StringBuilder();
        for(Character c : strs[0].toCharArray()){
            for(int i = 1; i < strs.length; i++){
                if(index > strs[i].length() - 1 || c != strs[i].charAt(index)){
                    return leastCommonPrefix.toString();
                }
            }
            leastCommonPrefix.append(c);
            index++;
        }
        return leastCommonPrefix.toString();
    }
}
