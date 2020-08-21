package com.algorithmpractice.algo.hard;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MaxSumIncreasingSubsequenceTest {

    private MaxSumIncreasingSubsequence msis;

    @Before
    public void setup(){
        msis = new MaxSumIncreasingSubsequence();
    }

    @Test
    public void TestCase1() {
        int[] input = {10, 70, 20, 30, 50, 11, 30};
        int[][] expected = {{110}, {10, 20, 30, 50}};
        assertTrue(compare(msis.maxSumIncreasingSubsequence(input), expected));
    }

    @Test
    public void TestCase2() {
        int[] input = {1,2,3,4,5};
        int[][] expected = {{15}, {1,2,3,4,5}};
        assertTrue(compare(msis.maxSumIncreasingSubsequence(input), expected));
    }

    @Test
    public void TestCase3() {
        int[] input = {5,4,3,2,1};
        int[][] expected = {{5}, {5}};
        assertTrue(compare(msis.maxSumIncreasingSubsequence(input), expected));
    }

     @Test
    public void TestCase4() {
        int[] input = {-5,-4,-3,-2,-1};
        int[][] expected = {{-1}, {-1}};
        assertTrue(compare(msis.maxSumIncreasingSubsequence(input), expected));
    }

    public static boolean compare(List<List<Integer>> arr1, int[][] arr2) {
        if (arr1.get(0).get(0) != arr2[0][0]) {
            return false;
        }
        for (int i = 0; i < arr1.get(1).size(); i++) {
            if (arr1.get(1).get(i) != arr2[1][i]) {
                return false;
            }
        }
        return true;
    }
}