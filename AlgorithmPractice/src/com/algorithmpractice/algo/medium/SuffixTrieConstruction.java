package com.algorithmpractice.algo.medium;

import java.util.HashMap;
import java.util.Map;

public class SuffixTrieConstruction {

    public static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();
    }

    public static class SuffixTrie {
        TrieNode root = new TrieNode();
        char endSymbol = '*';

        public SuffixTrie(String str) {
            populateSuffixTrieFrom(str);
        }

        //time O(n^2) | space O(n^2)
        public void populateSuffixTrieFrom(String str) {
            for (int i = 0; i < str.length(); i++) {
                insertCharacter(i, str);
            }
        }

        private void insertCharacter(int i, String str) {
            TrieNode node = root;
            for (int j = i; j < str.length(); j++) {
                char letter = str.charAt(j);
                if (!node.children.containsKey(letter)) {
                    TrieNode newNode = new TrieNode();
                    node.children.put(letter, newNode);
                }
                node = node.children.get(letter);
            }
            node = node.children.put(endSymbol, null);
        }

        //time O(m) | space O(1)
        public boolean contains(String str) {
            TrieNode node = root;
            for (int i = 0; i < str.length(); i++) {
                char letter = str.charAt(i);
                if (!node.children.containsKey(letter)) {
                    return false;
                }
                node = node.children.get(letter);
            }
            return node.children.containsKey(endSymbol);
        }

    }
}
