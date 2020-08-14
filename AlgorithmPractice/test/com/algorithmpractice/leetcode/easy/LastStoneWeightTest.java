package com.algorithmpractice.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class LastStoneWeightTest {

    @Test
    public void test(){
        LastStoneWeight lastStoneWeight = new LastStoneWeight();
        int[] stones = new int[]{2,7,4,1,8,1};
        assertEquals(1, lastStoneWeight.getLastStoneWeight(stones));
    }

}