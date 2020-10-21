package com.algorithmpractice.algo.dynamic.hard;

import java.util.*;

public class LongestStringChain {
    //O(n*m^2) + O(n(log(n)) n is strings size and m i length of longest string
    public static List<String> longestStringChain(List<String> strings) {
        Map<String, String> stringToPreviousMap = new HashMap<>();
        Map<String, Integer> stringToChainLengthMap = new HashMap<>();
        for(String string : strings){
            stringToChainLengthMap.put(string, 1);
        }
        //O(n(log(n))) time
        strings.sort(new StringComparator());

        populateMaps(strings, stringToPreviousMap, stringToChainLengthMap);

        String maxLengthString = getMaxLengthString(strings, stringToChainLengthMap);

        List<String> longestStringChain = chainLongestStringChain(stringToPreviousMap, maxLengthString);

        return longestStringChain.size() > 1 ? longestStringChain : new ArrayList<String>();
    }

    private static List<String> chainLongestStringChain(Map<String, String> stringToPreviousMap, String maxLengthString) {
        List<String> longestStringChain = new ArrayList<>();
        String currentString = maxLengthString;
        longestStringChain.add(currentString);
        while(stringToPreviousMap.containsKey(currentString)){
            currentString = stringToPreviousMap.get(currentString);
            longestStringChain.add(currentString);
        }
        return longestStringChain;
    }

    private static String getMaxLengthString(List<String> strings, Map<String, Integer> stringToChainLengthMap) {
        String maxLengthString = strings.get(0);
        int maxLength = Integer.MIN_VALUE;
        for(String string : strings){
            if(stringToChainLengthMap.containsKey(string)){
                if(stringToChainLengthMap.get(string) > maxLength){
                    maxLengthString = string;
                    maxLength = stringToChainLengthMap.get(string);
                }
            }
        }
        return maxLengthString;
    }

    private static void populateMaps(List<String> strings, Map<String, String> stringToPreviousMap, Map<String, Integer> stringToChainLengthMap) {
        StringBuilder sb;
        for(String string : strings){
            if(string.length() > 1){
                for(int i = 0; i < string.length(); i++){
                    sb = new StringBuilder(string);
                    sb.deleteCharAt(i);
                    String stringMinusChar = sb.toString();
                    if(strings.contains(stringMinusChar) && stringToChainLengthMap.containsKey(stringMinusChar)){
                        if(stringToChainLengthMap.get(stringMinusChar) + 1 > stringToChainLengthMap.get(string)){
                            stringToChainLengthMap.put(string, stringToChainLengthMap.get(stringMinusChar) + 1);
                            stringToPreviousMap.put(string, stringMinusChar);
                        }
                    }
                }
            }
        }
    }

    public static class StringComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b){
            if(a.length() > b.length()){
                return 1;
            }else if(a.length() < b.length()){
                return -1;
            }else{
                return 0;
            }
        }
    }
}
