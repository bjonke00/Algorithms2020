package com.algorithmpractice.algo.hard;

import java.util.*;

public class MultiStringSearch {
    //time O(n*m*l) | space O(n) where n is the small strings list and m*l is doing contains on a string
    public static List<Boolean> multiStringSearch(String bigString, String[] smallStrings) {
        List<Boolean> stringsInBigString = new ArrayList<>();

        for(String str : smallStrings){
            if(bigString.contains(str)){
                stringsInBigString.add(true);
            }else{
                stringsInBigString.add(false);
            }
        }

        return stringsInBigString;
    }

    ///
    //time O(ns + bs) | space O(ns)
    public static List<Boolean> multiStringSearch1(String bigString, String[] smallStrings) {
        Trie trie = new Trie();
        for(String smallString : smallStrings){
            trie.insert(smallString);
        }
        Set<String> containedStrings = new HashSet<String>();
        for(int i=0; i<bigString.length(); i++){
            findSmallStringsIn(bigString, i, trie, containedStrings);
        }
        List<Boolean> solution = new ArrayList<>();
        for(String str : smallStrings){
            solution.add(containedStrings.contains(str));
        }
        return solution;
    }

    private static void findSmallStringsIn(String str, int startIdx, Trie trie, Set<String> containedStrings){
        TrieNode currentNode = trie.root;
        for(int i=startIdx; i<str.length(); i++){
            char currentChar = str.charAt(i);
            if(!currentNode.children.containsKey(currentChar)){
                break;
            }
            currentNode = currentNode.children.get(currentChar);
            if(currentNode.children.containsKey(trie.endSymbol)){
                containedStrings.add(currentNode.word);
            }
        }
    }

    public static class TrieNode{
        Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();
        String word;
    }

    public static class Trie{
        TrieNode root = new TrieNode();
        char endSymbol = '*';

        public void insert(String str){
            TrieNode node = root;
            for(int i=0; i < str.length(); i++){
                char letter = str.charAt(i);
                if(!node.children.containsKey(letter)){
                    TrieNode newTrieNode = new TrieNode();
                    node.children.put(letter, newTrieNode);
                }
                node = node.children.get(letter);
            }
            node.children.put(endSymbol, null);
            node.word = str;
        }
    }
}
