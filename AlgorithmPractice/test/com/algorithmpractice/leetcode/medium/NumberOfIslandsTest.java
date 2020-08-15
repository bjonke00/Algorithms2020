package com.algorithmpractice.leetcode.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfIslandsTest {

    private NumberOfIslands numberOfIslands;

    @Before
    public void setup(){
        numberOfIslands = new NumberOfIslands();
    }

    @Test
    public void test_NumberOfIslands_1_Island(){
        char[][] input = {
                            {'1','1','1','1','0'},
                            {'1','1','0','1','0'},
                            {'1','1','0','0','0'},
                            {'0','0','0','0','0'}
                         };
        assertEquals(1, numberOfIslands.getNumberOfIslands(input));
    }

    @Test
    public void test_NumberOfIslands_3_Islands(){
        char[][] input = {
                          {'1','1','0','0','0'},
                          {'1','1','0','0','0'},
                          {'0','0','1','0','0'},
                          {'0','0','0','1','1'}
                         };
        assertEquals(3, numberOfIslands.getNumberOfIslands(input));
    }
}