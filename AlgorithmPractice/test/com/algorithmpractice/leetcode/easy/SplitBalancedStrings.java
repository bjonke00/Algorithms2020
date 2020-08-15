package com.algorithmpractice.leetcode.easy;

public class SplitBalancedStrings {
    public int splitBalancedStrings(String s) {
        int count = 0;
        int output = 0;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == 'R'){
                count++;
            }else if(c == 'L'){
                count--;
            }
            if(count == 0){
                output++;
            }
        }

        return output;
    }
}
