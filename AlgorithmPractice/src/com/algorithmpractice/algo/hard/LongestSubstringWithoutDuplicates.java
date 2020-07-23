package com.algorithmpractice.algo.hard;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutDuplicates {
    //time:O(n), space:O(n)
    public static String longestSubstringWithoutDuplication(String str) {
        //map of each character and their most recent location
        Map<Character, Integer> lastSeen = new HashMap();
        String answer = "";
        //travers through iterating the second pointer j
        for(int i=0, j=0; j<str.length(); j++){
            //only iterating i one greater than it's most recent duplicate
            if(lastSeen.containsKey(str.charAt(j))){
                i = Math.max(i, lastSeen.get(str.charAt(j))+1);
            }
            if(answer.length() < j+1-i){
                answer = str.substring(i,j+1);
            }
            lastSeen.put(str.charAt(j), j);
        }
        return answer;
    }
}
