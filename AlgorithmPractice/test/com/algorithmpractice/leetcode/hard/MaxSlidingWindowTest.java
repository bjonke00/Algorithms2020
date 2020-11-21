package com.algorithmpractice.leetcode.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSlidingWindowTest {

    @Test
    public void test_increase() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, MaxSlidingWindow.maxSlidingWindow(new int[]{-2, -1, 0, 1, 2, 3, 4}, 4));
    }

    @Test
    public void test_decrease() {
        assertArrayEquals(new int[]{4, 3, 2, 1}, MaxSlidingWindow.maxSlidingWindow(new int[]{4, 3, 2, 1, 0, -1, -2}, 4));
    }

    @Test
    public void test_increase_decrease() {
        assertArrayEquals(new int[]{3, 3, 2, 5}, MaxSlidingWindow.maxSlidingWindow(new int[]{1, 3, 1, 2, 0, 5}, 3));
    }

    @Test
    public void test_k_equals_1() {
        assertArrayEquals(new int[]{2, -2}, MaxSlidingWindow.maxSlidingWindow(new int[]{2, -2}, 1));
    }

}