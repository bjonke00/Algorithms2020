package com.algorithmpractice.other;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class AutoComplete {

    //time O(n*m) | space O(n)
    public static List<String> autoComplete(List<String> sampleSet, String str){
        List<String> output = new ArrayList();
        for(String s : sampleSet){
            if(s.contains(str)){
                output.add(s);
            }
        }
        return output;
    }

    //try using trie - O(n) + O(m)
//    public static List<String> autoComplete_trie(List<String> sampleSet, String str){
//        List<String> output = new ArrayList();
//        //creation is O(n^3) - create marking isword
//        SuffixTrie suffixTrie = new SuffixTrie(sampleSet, str);
//
//        TrieNode node = suffixTrie.root;
//
//        //go through trie and populate the iswords back to strings into the ouput arr
//
//        //O(n) to go to end of string
//        for(int i=0; i<str.length(); i++){
//            char letter = str.charAt(i);
//            if(node.children.containsKey(letter)){
//                node = node.children.get(letter);
//            }else{
//                return output;
//            }
//        }
//
//        TrieNode newRoot = node;
//        //O(m) for the rest of the words
//        for(int i=0; i<node.children.size(); i++){
//            node = newRoot;
//
//        }
//
//        return output;
//    }
//
//    public static class TrieNode{
//        private Map<Character, TrieNode> children = new HashMap<>();
//        private boolean isWord;
//    }
//
//    public static class SuffixTrie{
//        private TrieNode root;
//        private Character endSymbol = '*';
//
//        public SuffixTrie(List<String> arr, String s){
//            for(String str : arr){
//                populateSuffixTrie(str);
//            }
//        }
//        public void populateSuffixTrie(String str){
//            for(int i=0; i<str.length(); i++){
//                insertCharacter(i, str);
//            }
//        }
//        public void insertCharacter(int i, String str) {
//            TrieNode node = root;
//            for (int j = i; j < str.length(); j++) {
//                char letter = str.charAt(j);
//                if (!node.children.containsKey(letter)) {
//                    TrieNode newTrieNode = new TrieNode();
//                    node.children.put(letter, newTrieNode);
//                }
//                node = node.children.get(letter);
//            }
//            node = node.children.put(endSymbol, null);
//        }
//    }

    @Test
    public void testAutoComplete(){
        List<String> sampleSet = Arrays.asList(new String[]{"dog", "dark", "cat", "door", "dodge"});
        String input = "do";
        List<String> expected = Arrays.asList(new String[]{"dog", "door", "dodge"});
        assertEquals(expected, autoComplete(sampleSet, input));
    }
}
