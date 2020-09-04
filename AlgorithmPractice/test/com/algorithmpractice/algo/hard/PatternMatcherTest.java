package com.algorithmpractice.algo.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class PatternMatcherTest {

    @Test
    public void TestCase1() {
        String[] expected = {"go", "powerranger"};
        String inputPattern = "xxyxxy";
        String inputString = "gogopowerrangergogopowerranger";
        assertTrue(compare(PatternMatcher.patternMatcher(inputPattern, inputString), expected));
    }

    @Test
    public void Test_startingWithY() {
        String[] expected = {"b", "a"};
        String inputPattern = "yxyx";
        String inputString = "abab";
        assertTrue(compare(PatternMatcher.patternMatcher(inputPattern, inputString), expected));
    }

    @Test
    public void Test_noY() {
        String[] expected = {"hello", ""};
        String inputPattern = "xxxx";
        String inputString = "hellohellohellohello";
        assertTrue(compare(PatternMatcher.patternMatcher(inputPattern, inputString), expected));
    }

    public boolean compare(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        if (arr1.length == 0 && arr2.length == 0) {
            return true;
        }
        return arr1[0].equals(arr2[0]) && arr1[1].equals(arr2[1]);
    }

}