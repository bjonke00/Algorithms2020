package com.algorithmpractice.algo.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WaysToMakeChangeTest {

    private  WaysToMakeChange waysToMakeChange;

    @Before
    public void setup(){
        waysToMakeChange = new WaysToMakeChange();
    }

    @Test
    public void TestCase1() {
        int[] input = {1, 5, 10, 20};
        assertEquals(4, waysToMakeChange.numberOfWaysToMakeChange(10, input));
    }

    @Test
    public void TestCase2() {
        int[] input = {1, 5};
        assertEquals(2, waysToMakeChange.numberOfWaysToMakeChange(6, input));
    }

    @Test
    public void TestCase3() {
        int[] input = {1, 5, 10, 20};
        assertEquals(14, waysToMakeChange.numberOfWaysToMakeChange(25, input));
    }

}