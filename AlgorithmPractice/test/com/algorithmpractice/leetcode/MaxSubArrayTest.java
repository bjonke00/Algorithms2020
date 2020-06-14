package com.algorithmpractice.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSubArrayTest {

    private MaxSubArray maxSubArray;

    @Before
    public void setup(){
        maxSubArray = new MaxSubArray();
    }

    @Test
    public void test1(){
        int[] input = new int[]{3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4};
        int output = 19;
        assertEquals(output, maxSubArray.kadanesAlgorithm(input));
    }

    @Test
    public void test2(){
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int output = 55;
        assertEquals(output, maxSubArray.kadanesAlgorithm(input));
    }

    @Test
    public void test3(){
        int[] input = new int[]{-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
        int output = -1;
        assertEquals(output, maxSubArray.kadanesAlgorithm(input));
    }

    @Test
    public void test4(){
        int[] input = new int[]{-10, -2, -9, -4, -8, -6, -7, -1, -3, -5};
        int output = -1;
        assertEquals(output, maxSubArray.kadanesAlgorithm(input));
    }

    @Test
    public void test5(){
        int[] input = new int[]{1, 2, 3, 4, 5, 6, -20, 7, 8, 9, 10};
        int output = 35;
        assertEquals(output, maxSubArray.kadanesAlgorithm(input));
    }

    @Test
    public void test6(){
        int[] input = new int[]{1, 2, 3, 4, 5, 6, -22, 7, 8, 9, 10};
        int output = 34;
        assertEquals(output, maxSubArray.kadanesAlgorithm(input));
    }

    @Test
    public void test7(){
        int[] input = new int[]{1, 2, -4, 3, 5, -9, 8, 1, 2};
        int output = 11;
        assertEquals(output, maxSubArray.kadanesAlgorithm(input));
    }

    @Test
    public void test8(){
        int[] input = new int[]{3, 4, -6, 7, 8};
        int output = 16;
        assertEquals(output, maxSubArray.kadanesAlgorithm(input));
    }

    @Test
    public void test9(){
        int[] input = new int[]{8, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4};
        int output = 23;
        assertEquals(output, maxSubArray.kadanesAlgorithm(input));
    }

    @Test
    public void test10(){
        int[] input = new int[]{8, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 6};
        int output = 24;
        assertEquals(output, maxSubArray.kadanesAlgorithm(input));
    }

}