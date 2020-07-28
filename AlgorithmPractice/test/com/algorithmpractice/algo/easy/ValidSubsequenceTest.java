package com.algorithmpractice.algo.easy;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ValidSubsequenceTest {

    @Test
    public void TestCase1() {
        ValidSubsequence validSubsequence = new ValidSubsequence();
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, 10);
        assertEquals(true, validSubsequence.isValidSubsequence(array, sequence));
    }

}