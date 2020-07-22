package com.algorithmpractice.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    //O(n) time , O(n) space
    public int lengthOfLongestSubstring(String s) {
        int answer = 0;
        Map<Character, Integer> seen = new HashMap();
       for(int i=0,j=0; j < s.length(); j++){
            //is anything from i to j duplicate, if so move one pointer past the duplicate
            if(seen.containsKey(s.charAt(j))) {
                i = Math.max(i, seen.get(s.charAt(j))+1);
            }

            //check if the current substring is the longest
            answer = Math.max(answer, j+1-i);

            //add j to map
            seen.put(s.charAt(j),j);
        }
        return answer;
    }

    public int lengthOfLongestSubstring1(String s) {
        if(s.length()==0)
            return 0;
        if(s.length()==1)
            return 1;

        int p1=0, p2=1;
        int answer = 1;
        Map<Character, Integer> seen = new HashMap();
        seen.put(s.charAt(p1), p1);

        while(p2 < s.length()){
            //is anything from p1 to p2 duplicate, if so move one pointer past the duplicate
            if(seen.containsKey(s.charAt(p2))) {
                p1 = Math.max(p1, seen.get(s.charAt(p2)) + 1);
            }

            //check if the current substring is the longest
            if(p2+1-p1>answer)
                answer = p2+1-p1;

            //add p2 to map
            seen.put(s.charAt(p2),p2);

            //continue to iterate
            p2++;
        }

        return answer;
    }
}
