package com.algorithmpractice.algo.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class MonotonicArrayTest {

    @Test
    public void TestCase1() {
        MonotonicArray m = new MonotonicArray();
        int[] array = new int[] {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
        boolean expected = true;
        boolean actual = m.isMonotonic(array);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase2() {
        MonotonicArray m = new MonotonicArray();
        int[] array = new int[] {1, 1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 8, 9, 10, 11};
        boolean expected = true;
        boolean actual = m.isMonotonic(array);
        assertEquals(expected, actual);
    }
}