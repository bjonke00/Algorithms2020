package com.algorithmpractice.algo.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HasSingleCycleTest {

    private HasSingleCycle hsc;

    @Before
    public void setup() {
        hsc = new HasSingleCycle();
    }

    @Test
    public void TestCase1() {
        assertTrue(hsc.hasSingleCycle(new int[]{2, 3, 1, -4, -4, 2}));
    }

    @Test
    public void TestCase2() {
        assertFalse(hsc.hasSingleCycle(new int[]{0, 3, 1, -4, -4, 2}));
    }

    @Test
    public void TestCase3() {
        assertFalse(hsc.hasSingleCycle(new int[]{2, 3, -2, -4, -4, 2}));
    }

    @Test
    public void TestCase4() {
        assertFalse(hsc.hasSingleCycle(new int[]{2, 3, -10, -4, -4, 2}));
    }

}