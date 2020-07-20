package com.algorithmpractice.leetcode.easy;

import java.util.*;

public class ReverseLetters {
    //time and space O(n)
    public String reverseOnlyLetters(String S) {
        Stack<Character> letters = new Stack();
        for(int i=0; i<S.length(); i++){
            char c = S.charAt(i);
            if(Character.isLetter(c)){
                letters.push(c);
            }
        }
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<S.length(); i++){
            char c = S.charAt(i);
            if(Character.isLetter(c)){
                answer.append(letters.pop());
            }else{
                answer.append(c);
            }
        }
        return answer.toString();
    }
}
