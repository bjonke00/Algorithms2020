package com.algorithmpractice.algo.dynamic.hard;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LongestStringChainTest {
    @Test
    public void TestCase1() {
        List<String> strings =
                new ArrayList<String>(
                        Arrays.asList("bade", "bab", "bad", "babde", "bde", "be", "2bade", "babdec"));
        List<String> expected =
                new ArrayList<String>(Arrays.asList("babdec", "babde", "bade", "bde", "be"));
        assertTrue(LongestStringChain.longestStringChain(strings).equals(expected));
    }
}