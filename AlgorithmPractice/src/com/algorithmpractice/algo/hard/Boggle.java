package com.algorithmpractice.algo.hard;

import java.util.*;

public class Boggle {
    //time O(nm*8^s + ws) | space O(nm +ws)
    public static List<String> boggleBoard(char[][] board, String[] words) {
        Trie trie = new Trie();
        for(String word : words){
            trie.add(word);
        }

        Set<String> wordsFoundSet = new HashSet<>();
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[row].length; col++){
                explore(row, col, board, trie.root, visited, wordsFoundSet);
            }
        }

        List<String> wordsFoundList = new ArrayList<>(wordsFoundSet);
        return wordsFoundList;
    }

    private static void explore(int row, int col, char[][] board, TrieNode trieNode, boolean[][] visited, Set<String> wordsFoundSet){
        if(visited[row][col]){
            return;
        }
        char letter = board[row][col];
        if(!trieNode.children.containsKey(letter)){
            return;
        }
        visited[row][col] = true;
        trieNode = trieNode.children.get(letter);
        if(trieNode.children.containsKey('*')){
            wordsFoundSet.add(trieNode.word);
        }
        List<Integer[]> neighbors = getNeighbors(row, col, board);
        for(Integer[] neighbor : neighbors){
            explore(neighbor[0], neighbor[1], board, trieNode, visited, wordsFoundSet);
        }
        visited[row][col] = false;
    }

    private static List<Integer[]> getNeighbors(int row, int col, char[][] board){
        List<Integer[]> neighbors = new ArrayList<>();

        //left-upper-diagonal
        if(row > 0 && col > 0){
            neighbors.add(new Integer[]{row - 1, col - 1});
        }
        //upper
        if(row > 0){
            neighbors.add(new Integer[]{row - 1, col});
        }
        //right-upper-diagonal
        if(row > 0 && col < board[row].length - 1){
            neighbors.add(new Integer[]{row - 1, col + 1});
        }
        //left
        if(col > 0){
            neighbors.add(new Integer[]{row, col - 1});
        }
        //right
        if(col < board[row].length - 1){
            neighbors.add(new Integer[]{row, col + 1});
        }
        //left-lower-diagonal
        if(row <  board.length - 1 && col > 0){
            neighbors.add(new Integer[]{row + 1, col - 1});
        }
        //lower
        if(row < board[row].length - 1){
            neighbors.add(new Integer[]{row + 1, col});
        }
        //right-lower-diagonal
        if(row < board[row].length - 1 && col < board[row].length - 1){
            neighbors.add(new Integer[]{row + 1, col + 1});
        }

        return neighbors;
    }

    static class TrieNode{
        Map<Character, TrieNode> children = new HashMap<>();
        String word = "";
    }

    static class Trie {
        TrieNode root;
        char endSymbol;

        public Trie(){
            this.root = new TrieNode();
            this.endSymbol = '*';
        }

        public void add(String str){
            TrieNode node = this.root;
            for(int i = 0; i < str.length(); i++){
                char letter = str.charAt(i);
                if(!node.children.containsKey(letter)){
                    TrieNode newNode = new TrieNode();
                    node.children.put(letter, newNode);
                }
                node = node.children.get(letter);
            }
            node.children.put(this.endSymbol, null);
            node.word = str;
        }
    }
}
