package com.algorithmpractice.algo.hard;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MultiStringSearchTest {

    @Test
    public void TestCase1() {
        MultiStringSearch mss = new MultiStringSearch();
        boolean[] expected = {true, false, true, true, false, true, false};
        List<Boolean> output =
                mss.multiStringSearch(
                        "this is a big string",
                        new String[] {"this", "yo", "is", "a", "bigger", "string", "kappa"});
        assertTrue(compare(output, expected));
        List<Boolean> output1 =
                mss.multiStringSearch1(
                        "this is a big string",
                        new String[] {"this", "yo", "is", "a", "bigger", "string", "kappa"});
        assertTrue(compare(output1, expected));
    }

    public boolean compare(List<Boolean> arr1, boolean[] arr2) {
        if (arr1.size() != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}