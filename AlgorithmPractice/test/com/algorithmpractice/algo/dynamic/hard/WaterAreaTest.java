package com.algorithmpractice.algo.dynamic.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class WaterAreaTest {
    @Test
    public void TestCase1() {
        int[] input = {0, 8, 0, 0, 5, 0, 0, 10, 0, 0, 1, 1, 0, 3};
        assertTrue(WaterArea.waterArea(input) == 48);
        assertTrue(WaterArea.waterAreaInLinearSpace(input) == 48);
    }

    @Test
    public void TestCase_Empty() {
        int[] input = {};
        assertTrue(WaterArea.waterArea(input) == 0);
        assertTrue(WaterArea.waterAreaInLinearSpace(input) == 0);
    }

}