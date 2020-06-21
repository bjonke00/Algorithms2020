package com.algorithmpractice.algo;

import java.util.*;

public class GroupAnagrams {
    /*
    Write a function that takes in array of strings and groups anagrams together.
    Anagrams are strings made up of exactly the same letters, where order does NOT matter.
     */

    //Time O(n) & space O(n)
    public static List<List<String>> groupAnagrams(List<String> words) {
        //map of anagrams --key is the ordered anagram and value is list of original values
        Map<String, List<String>> anagrams = new HashMap<>();

        //sort the words & add to map
        for (String word : words) {
            char[] sortedChars = word.toCharArray();
            Arrays.sort(sortedChars);
            String sortedWord = new String(sortedChars);
            List<String> temp = anagrams.get(sortedWord);
            if (temp == null) {
                temp = new ArrayList<>();
            }
            temp.add(word);
            anagrams.put(sortedWord, temp);
        }

        //output
        List<List<String>> output = new ArrayList();

        //retrieve the words from the map and add to output
        anagrams.forEach((k, v) -> output.add(v));

        return output;
    }

}
