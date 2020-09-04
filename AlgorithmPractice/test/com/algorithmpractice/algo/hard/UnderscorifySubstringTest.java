package com.algorithmpractice.algo.hard;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class UnderscorifySubstringTest {

    @Test
    public void testGetLocations(){
        Integer[] indices1 = {0,4};
        Integer[] indices2 = {14,18};
        Integer[] indices3 = {18,22};
        Integer[] indices4 = {33,37};
        Integer[] indices5 = {36,40};
        Integer[] indices6 = {39,43};
        List<Integer[]> expected = Arrays.asList(indices1,indices2,indices3,indices4,indices5,indices6);

        String str = "testthis is a testtest to see if testestest it works";
        String substring = "test";
        List<Integer[]> actual = UnderscorifySubstring.getLocations(str, substring);

        for(int i=0; i<actual.size(); i++){
            assertEquals(expected.get(i)[0], actual.get(i)[0]);
            assertEquals(expected.get(i)[1], actual.get(i)[1]);
        }
    }

    @Test
    public void testCollapseIndices(){
        Integer[] expectedIndices1 = {0,4};
        Integer[] expectedIndices2 = {14,22};
        Integer[] expectedIndices3 = {33,43};
        List<Integer[]> expected = Arrays.asList(expectedIndices1,expectedIndices2,expectedIndices3);

        Integer[] indices1 = {0,4};
        Integer[] indices2 = {14,18};
        Integer[] indices3 = {18,22};
        Integer[] indices4 = {33,37};
        Integer[] indices5 = {36,40};
        Integer[] indices6 = {39,43};
        List<Integer[]> locations = Arrays.asList(indices1,indices2,indices3,indices4,indices5,indices6);
        List<Integer[]> actual = UnderscorifySubstring.mergeLocations(locations);

        for(int i=0; i<actual.size(); i++){
            assertEquals(expected.get(i)[0], actual.get(i)[0]);
            assertEquals(expected.get(i)[1], actual.get(i)[1]);
        }
    }

    @Test
    public void testUnderscorify() {
        String expected = "_test_this is a _testtest_ to see if _testestest_ it works";
        String output =
                UnderscorifySubstring.underscorifySubstring(
                        "testthis is a testtest to see if testestest it works", "test");
        assertTrue(expected.equals(output));
    }

    @Test
    public void testUnderscorify_substring_does_not_exist() {
        String expected = "testthis is a testtest to see if testestest it works";
        String output =
                UnderscorifySubstring.underscorifySubstring(
                        "testthis is a testtest to see if testestest it works", "blahblah");
        assertTrue(expected.equals(output));
    }

    @Test
    public void testUnderscorify_trailing_substring() {
        String expected = "_test_this is a _testtest_ to see if _testestest_ it works _test_";
        String output =
                UnderscorifySubstring.underscorifySubstring(
                        "testthis is a testtest to see if testestest it works test", "test");
        assertTrue(expected.equals(output));
    }

    @Test
    public void testUnderscorify_repetition() {
        String expected = "_bbbbbbbbbbbbbbbbbbbbbbbbbbb_a_bbb_abbab";
        String output =
                UnderscorifySubstring.underscorifySubstring(
                        "bbbbbbbbbbbbbbbbbbbbbbbbbbbabbbabbab", "bbb");
        assertTrue(expected.equals(output));
    }
}