package com.algorithmpractice.algo.strings.extreme;

public class KnuthMorrisPratt {
    //time (n+m) | space O(m)
    public static boolean knuthMorrisPrattAlgorithm(String string, String substring) {
        int[] pattern = buildPattern(substring);
        int i = 0, j = 0;
        while (i < string.length()) {
            if (string.charAt(i) == substring.charAt(j)) { //pattern match move both iterators
                i++;
                j++;
            }
            if (j == substring.length()) { //reached end is a match
                return true;
            }
            if (i < string.length() && string.charAt(i) != substring.charAt(j)) { //i hasn't reached end and no match
                if (j != 0) { //j not at start move back one
                    j = pattern[j - 1];
                } else{ //move i foward
                    i++;
                }
            }
        }
        return false;
    }

    public static int[] buildPattern(String substring){
        int[] pattern = new int[substring.length()];
        int i = 0, j = 1;
        while(j < substring.length()){
            if(substring.charAt(i) == substring.charAt(j)){ //pattern match move both iterators and increase pattern[j]
                i++;
                pattern[j] = i;
                j++;
            }else if(i != 0){ //pattern doesn't match move first iterator (i) back one
                i = pattern[i - 1];
            }else{ //first iterator (i) is back to start
                pattern[j] = 0;
                j++;
            }
        }
        return pattern;
    }
}
