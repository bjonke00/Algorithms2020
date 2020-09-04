package com.algorithmpractice.algo.hard;

import java.util.HashMap;
import java.util.Map;

public class PatternMatcher {
//time : O(n^2 +m) | space O(n+m)
    public static String[] patternMatcher(String pattern, String str) {
        if(pattern.length() > str.length())
            return new String[] {};

        char[] newPattern = getNewPattern(pattern);
        boolean isSwapped = false;
        if(newPattern[0] != pattern.charAt(0)){
            isSwapped = true;
        }

        Map<Character, Integer> counts = new HashMap<>(2);
        counts.put('x',0);
        counts.put('y',0);
        int firstYPos = populateCountsGetFirstYPosition(newPattern,counts);

        // int lengthOfX = 1, lengthOfY = (str.length()-counts.get('x')*lengthOfX)/counts.get('y');
        if(counts.get('y') != 0){
            for(int lenOfX = 1; lenOfX < str.length(); lenOfX++){
                double lenOfY = ((double) str.length() - (double) counts.get('x') * (double) lenOfX) / (double) counts.get('y');
                if(lenOfY <= 0 || lenOfY % 1 != 0){
                    continue;
                }
                int yIdx = firstYPos * lenOfX;
                String x = str.substring(0, lenOfX);
                String y = str.substring(yIdx, yIdx + (int) lenOfY);
                String potentialMatch = buildPotentialMatch(newPattern, x, y);
                if(str.equals(potentialMatch)){
                    return isSwapped ? new String[] {y, x} : new String[] {x, y};
                }
            }
        }else{
            double lenOfX = str.length() / counts.get('x');
            if(lenOfX % 1 == 0){
                String x = str.substring(0, (int) lenOfX);
                String potentialMatch = buildPotentialMatch(newPattern, x, "");
                if(str.equals(potentialMatch)){
                    return isSwapped ? new String[] {"", x} : new String[] {x, ""};
                }
            }
        }

        return new String[] {};
    }

    static char[] getNewPattern(String pattern){
        char[] newPattern = pattern.toCharArray();
        if(pattern.charAt(0) == 'x'){
            return newPattern;
        }
        for(int i=0; i<pattern.length(); i++){
            if(newPattern[i] == 'x'){
                newPattern[i] = 'y';
            }else{
                newPattern[i] = 'x';
            }
        }
        return newPattern;
    }

    static int populateCountsGetFirstYPosition(char[] pattern, Map<Character, Integer> counts){
        int firstYPos = -1;
        for(int i=0; i<pattern.length; i++){
            char c = pattern[i];
            counts.put(c, counts.get(c)+1);
            if(c == 'y' && firstYPos == -1)
                firstYPos = i;
        }
        return firstYPos;
    }

    static String buildPotentialMatch(char[] pattern, String x, String y){
        StringBuilder potentialMatch = new StringBuilder();
        for(char c : pattern){
            if(c == 'x'){
                potentialMatch.append(x);
            }else{
                potentialMatch.append(y);
            }
        }
        return potentialMatch.toString();
    }
}
