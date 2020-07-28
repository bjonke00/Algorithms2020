package com.algorithmpractice.algo.medium;

import com.algorithmpractice.algo.medium.GroupAnagrams;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class GroupAnagramsTest {

    private GroupAnagrams groupAnagrams;

    @Before
    public void setup() {
        groupAnagrams = new GroupAnagrams();
    }

    @Test
    public void test1() {
        List<String> words =
                new ArrayList<String>(Arrays.asList("yo", "act", "flop", "tac", "cat", "oy", "olfp"));
        List<List<String>> expected = new ArrayList<List<String>>();
        expected.add(new ArrayList<String>(Arrays.asList("yo", "oy")));
        expected.add(new ArrayList<String>(Arrays.asList("flop", "olfp")));
        expected.add(new ArrayList<String>(Arrays.asList("act", "tac", "cat")));
        List<List<String>> output = groupAnagrams.groupAnagrams(words);
        for (List<String> innerList : output) {
            Collections.sort(innerList);
        }
        assertTrue(compare(expected, output));
    }

    @Test
    public void test2() {
        List<String> words =
                new ArrayList<String>(Arrays.asList());
        List<List<String>> expected = new ArrayList<List<String>>();
        List<List<String>> output = groupAnagrams.groupAnagrams(words);
        for (List<String> innerList : output) {
            Collections.sort(innerList);
        }
        assertTrue(compare(expected, output));
    }

    @Test
    public void test3() {
        List<String> words =
                new ArrayList<String>(Arrays.asList("test"));
        List<List<String>> expected = new ArrayList<List<String>>();
        expected.add(new ArrayList<String>(Arrays.asList("test")));
        List<List<String>> output = groupAnagrams.groupAnagrams(words);
        for (List<String> innerList : output) {
            Collections.sort(innerList);
        }
        assertTrue(compare(expected, output));
    }

    public boolean compare(List<List<String>> expected, List<List<String>> output) {
        if (expected.size() != output.size()) return false;

        for (List<String> group : expected) {
            Collections.sort(group);
            if (!output.contains(group)) return false;
        }

        return true;
    }

}