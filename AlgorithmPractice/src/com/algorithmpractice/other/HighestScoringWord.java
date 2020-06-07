package com.algorithmpractice.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HighestScoringWord {
// No.4
// Given a string of words, your goal is to find the highest scoring word in the string.
// a is worth 1 point, b is worth 2 points, c is worth 3 points, and so on,
// all the way up until z, which is worth 26 points.
// You can assume that strings will consist only of lowercase letters and spaces.
// In the event that two words have the same score, return the word that appears
// first in the string.
//
    //time : O(n) / space : O(1)
    public String findHighestScoringWord(String sentence) {
        String highest = null;
        int max = 0;
        for (String word : sentence.split(" ")) {
            int sum = 0;
            for (int j = 0; j < word.length(); j++) {
                sum += word.charAt(j) - 'a' + 1;
            }
            if(sum>max){
                max = sum;
                highest=word;
            }
        }
        return highest;
    }
}
