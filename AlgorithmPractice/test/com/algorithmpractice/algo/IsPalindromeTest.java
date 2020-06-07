package com.algorithmpractice.algo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsPalindromeTest {

    private IsPalindrome isPalindrome;

    @Before
    public void setUp(){
        isPalindrome = new IsPalindrome();
    }

    @Test
    public void test1(){
        String input = "A man, a plan, a canal: Panama";
        assertTrue(isPalindrome.isPalindrome(input));
    }

    @Test
    public void test2(){
        String input = "race a car";
        assertFalse(isPalindrome.isPalindrome(input));
    }

}