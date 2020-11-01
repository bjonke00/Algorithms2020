package com.algorithmpractice.algo.medium;

import java.util.*;

public class GroupAnagrams {
    /*
    Write a function that takes in array of strings and groups anagrams together.
    Anagrams are strings made up of exactly the same letters, where order does NOT matter.
     */

    //Time O(n*m*log(n)) & space O(n*m) // where n is the number of words and m is the longest word
    public static List<List<String>> groupAnagrams(List<String> words) {
        //map of anagrams --key is the ordered anagram and value is list of original values
        Map<String, List<String>> anagramGroups = new HashMap<>();

        //sort the words & add to map
        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = String.valueOf(chars);
            List<String> anagramGroup = anagramGroups.getOrDefault(sortedWord, new ArrayList<String>());
            anagramGroup.add(word);
            anagramGroups.put(sortedWord, anagramGroup);
        }

        return new ArrayList(anagramGroups.values());
    }

}
