package com.algorithmpractice.algo.veryhard;

import java.lang.reflect.Array;
import java.util.*;

public class SmallestSubstringContaining {
    //time : O(n+m) | space : O(n+m)
    public static String smallestSubstringContaining(String bigString, String smallString) {
        Map<Character, Integer> charCounts = getCharCounts(smallString);
        List<Integer> smallestBounds = getSmallestBounds(bigString, charCounts);
        return smallestBounds.get(1) == Integer.MAX_VALUE ? "" : bigString.substring(smallestBounds.get(0) , smallestBounds.get(1)+1);
    }

    static Map<Character, Integer> getCharCounts(String smallString){
        Map<Character, Integer> counts = new HashMap<>();

        for(int i=0; i < smallString.length(); i++){
            char c = smallString.charAt(i);
            counts.put(c, counts.getOrDefault(c, 0)+1);
        }

        return counts;
    }

    static List<Integer> getSmallestBounds(String str, Map<Character, Integer> targetCharCounts){
        List<Integer> smallestBounds = new ArrayList<>(Arrays.asList(0, Integer.MAX_VALUE));
        Map<Character, Integer> substringCharCounts = new HashMap<>();
        int leftIdx=0, rightIdx=0, currNumUniqueChars=0, targetNumUniqueChars=targetCharCounts.size();
        while(rightIdx < str.length()){
            char rightChar = str.charAt(rightIdx);
            if(!targetCharCounts.containsKey(rightChar)) {
                rightIdx++;
                continue;
            }
            substringCharCounts.put(rightChar, substringCharCounts.getOrDefault(rightChar, 0)+1);
            if(substringCharCounts.get(rightChar).equals(targetCharCounts.get(rightChar))){
                currNumUniqueChars++;
            }
            while(currNumUniqueChars == targetNumUniqueChars && leftIdx <= rightIdx){
                smallestBounds = getSmallerBounds(leftIdx, rightIdx, smallestBounds.get(0), smallestBounds.get(1));
                char leftChar = str.charAt(leftIdx);
                if(!targetCharCounts.containsKey(leftChar)){
                    leftIdx++;
                    continue;
                }
                if(substringCharCounts.get(leftChar).equals(targetCharCounts.get(leftChar))){
                    currNumUniqueChars--;
                }
                substringCharCounts.put(leftChar, substringCharCounts.get(leftChar)-1);
                leftIdx++;
            }
            rightIdx++;
        }
        return smallestBounds;
    }

    static List<Integer> getSmallerBounds(int idx1, int idx2, int idx3, int idx4){
        return (idx2 - idx1 < idx4 - idx3)
            ? new ArrayList<Integer>(Arrays.asList(idx1, idx2))
            : new ArrayList<Integer>(Arrays.asList(idx3, idx4));
    }

}
