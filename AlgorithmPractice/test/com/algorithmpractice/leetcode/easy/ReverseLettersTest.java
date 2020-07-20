package com.algorithmpractice.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseLettersTest {

    @Test
    public void testReverseLetters(){
        ReverseLetters reverseLetters = new ReverseLetters();
        assertEquals("dc-ba", reverseLetters.reverseOnlyLetters("ab-cd"));
    }

    @Test
    public void testReverseLetters1(){
        ReverseLetters reverseLetters = new ReverseLetters();
        assertEquals("Qedo1ct-eeLg=ntse-T!", reverseLetters.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }
}