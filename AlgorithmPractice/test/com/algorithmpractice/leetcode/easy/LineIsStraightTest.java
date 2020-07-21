package com.algorithmpractice.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class LineIsStraightTest {
    @Test
    public void testIsStraight(){
        int[][] input = new int[][]{{0,0},{0,1},{0,-1}};
        LineIsStraight lineIsStraight = new LineIsStraight();
        assertTrue(lineIsStraight.checkStraightLine(input));
    }
    @Test
    public void testIsStraight2(){
        int[][] input = new int[][]{{0,0},{0,5},{5,5},{5,0}};
        LineIsStraight lineIsStraight = new LineIsStraight();
        assertFalse(lineIsStraight.checkStraightLine(input));
    }
    @Test
    public void testIsStraight3(){
        int[][] input = new int[][]{{-4,-3},{1,0},{3,-1},{0,-1},{-5,2}};
        LineIsStraight lineIsStraight = new LineIsStraight();
        assertFalse(lineIsStraight.checkStraightLine(input));
    }
}