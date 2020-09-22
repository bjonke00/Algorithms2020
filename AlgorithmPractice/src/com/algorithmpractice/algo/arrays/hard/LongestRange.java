package com.algorithmpractice.algo.arrays.hard;

import java.util.HashMap;
import java.util.Map;

public class LongestRange {
    //O(n) time and O(n) space
    public static int[] largestRange(int[] array) {
        Map<Integer, Boolean> visited = new HashMap<>();
        int maxLength = 0;
        int[] maxRange = {array[0],array[0]};

        for(int i : array){
            visited.put(i, false);
        }

        for(int i : array){
            if(!visited.get(i)){
                visited.put(i,true);
                int currentLength = 1;
                int left = i - 1;
                while(visited.containsKey(left)){
                    visited.put(left,true);
                    currentLength++;
                    left--;
                }
                int right = i + 1;
                while(visited.containsKey(right)){
                    visited.put(right, true);
                    currentLength++;
                    right++;
                }
                if(currentLength > maxLength){
                    maxLength = currentLength;
                    maxRange = new int[]{left + 1, right - 1};
                }
            }
        }

        return maxRange;
    }
}
