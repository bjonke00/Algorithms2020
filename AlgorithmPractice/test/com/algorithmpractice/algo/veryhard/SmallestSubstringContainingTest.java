package com.algorithmpractice.algo.veryhard;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SmallestSubstringContainingTest {

    @Test
    public void Test_getCounts() {
        String smallString = "$$abf";
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('$', 2);
        expected.put('a', 1);
        expected.put('b', 1);
        expected.put('f', 1);

        assertTrue(SmallestSubstringContaining.getCharCounts(smallString).equals(expected));
    }

    @Test
    public void test_getSmallestBounds(){
        List<Integer> expected = Arrays.asList(6,11);

        String bigString = "abcd$ef$axb$c$";
        String smallString = "$$abf";
        Map<Character, Integer> charCounts = SmallestSubstringContaining.getCharCounts(smallString);
        List<Integer> actual = SmallestSubstringContaining.getSmallestBounds(bigString, charCounts);

        assertEquals(expected, actual);
    }

    @Test
    public void TestCase1() {
        String bigString = "abcd$ef$axb$c$";
        String smallString = "$$abf";
        String expected = "f$axb$";
        assertTrue(SmallestSubstringContaining.smallestSubstringContaining(bigString, smallString).equals(expected));
    }

    @Test
    public void TestCase2() {
        String bigString = "14562435612z!8828!193236!336!5$41!23!5!6789901#";
        String smallString = "#!2z";
        String expected = "z!8828!193236!336!5$41!23!5!6789901#";
        assertTrue(SmallestSubstringContaining.smallestSubstringContaining(bigString, smallString).equals(expected));
    }

}