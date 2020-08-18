package com.algorithmpractice.algo.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class LevenshteinDistanceTest {
    @Test
    public void TestCase1() {
        LevenshteinDistance levenshteinDistance = new LevenshteinDistance();
        assertEquals(2, levenshteinDistance.getLevenshteinDistance("abc", "zabd"));
    }
}