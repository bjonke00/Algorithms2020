package com.algorithmpractice.algo.hard;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BoggleTest {
    @Test
    public void TestCase1() {
        char[][] board = {
                {'t', 'h', 'i', 's', 'i', 's', 'a'},
                {'s', 'i', 'm', 'p', 'l', 'e', 'x'},
                {'b', 'x', 'x', 'x', 'x', 'e', 'b'},
                {'x', 'o', 'g', 'g', 'l', 'x', 'o'},
                {'x', 'x', 'x', 'D', 'T', 'r', 'a'},
                {'R', 'E', 'P', 'E', 'A', 'd', 'x'},
                {'x', 'x', 'x', 'x', 'x', 'x', 'x'},
                {'N', 'O', 'T', 'R', 'E', '-', 'P'},
                {'x', 'x', 'D', 'E', 'T', 'A', 'E'},
        };
        String[] words = {
                "this", "is", "not", "a", "simple", "boggle", "board", "test", "REPEATED", "NOTRE-PEATED"
        };
        String[] expected = {"this", "is", "a", "simple", "boggle", "board", "NOTRE-PEATED"};
        List<String> actual = Boggle.boggleBoard(board, words);
        assertTrue(actual.size() == expected.length);
        for (String word : actual) {
            assertTrue(contains(expected, word));
        }
    }

    public static boolean contains(String[] wordArray, String targetWord) {
        for (String word : wordArray) {
            if (targetWord.equals(word)) {
                return true;
            }
        }
        return false;
    }
}