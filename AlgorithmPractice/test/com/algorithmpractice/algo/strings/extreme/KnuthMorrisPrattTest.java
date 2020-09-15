package com.algorithmpractice.algo.strings.extreme;

import org.junit.Test;

import static org.junit.Assert.*;

public class KnuthMorrisPrattTest {
    @Test
    public void TestCase1() {
        assertTrue(KnuthMorrisPratt.knuthMorrisPrattAlgorithm("aefoaefcdaefcdaed", "aefcdaed") == true);
    }

    @Test
    public void TestCase2() {
        assertTrue(KnuthMorrisPratt.knuthMorrisPrattAlgorithm("abcdef", "abcdf") == false);
    }
}