package com.algorithmpractice.leetcode;

public class ReverseString {

	public void reverseString(char[] s) {
        StringBuilder sb = new StringBuilder();
        for(int i=s.length-1;i>-1;i--)
            sb.append(s[i]);
        for(int i=0; i<s.length; i++)
            s[i] = sb.charAt(i);
    }
	
}
