package com.algorithmpractice.algo.veryhard;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleCountTest {
    @Test
    public void TestCase1() {
        RectangleCount.Point[] coords =
                new RectangleCount.Point[] {
                        new RectangleCount.Point(0, 0),
                        new RectangleCount.Point(0, 1),
                        new RectangleCount.Point(1, 1),
                        new RectangleCount.Point(1, 0),
                        new RectangleCount.Point(2, 1),
                        new RectangleCount.Point(2, 0),
                        new RectangleCount.Point(3, 1),
                        new RectangleCount.Point(3, 0)
                };
        assertTrue(RectangleCount.getRectangleCount(coords) == 6);
    }
}