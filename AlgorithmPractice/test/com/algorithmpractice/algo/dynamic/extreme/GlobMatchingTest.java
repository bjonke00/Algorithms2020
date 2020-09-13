package com.algorithmpractice.algo.dynamic.extreme;

import org.junit.Test;

import static org.junit.Assert.*;

public class GlobMatchingTest {

    @Test
    public void TestCase1() {
        String fileName = "abcdefg";
        String pattern = "a*e?g";
        assertTrue(GlobMatching.globMatching(fileName, pattern) == true);
    }

    @Test
    public void TestCase1_starting_asterisks() {
        String fileName = "abcdefg";
        String pattern = "***";
        assertTrue(GlobMatching.globMatching(fileName, pattern) == true);
    }

    @Test
    public void TestCase1_starting_asterisks_followed_by_matching_first_char() {
        String fileName = "abcdefg";
        String pattern = "***a***";
        assertTrue(GlobMatching.globMatching(fileName, pattern) == true);
    }

    @Test
    public void TestCase1_extra_char() {
        String fileName = "abcdefg";
        String pattern = "***a***g?";
        assertTrue(GlobMatching.globMatching(fileName, pattern) == false);
    }




}