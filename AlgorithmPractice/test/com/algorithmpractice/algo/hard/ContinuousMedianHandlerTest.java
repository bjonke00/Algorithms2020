package com.algorithmpractice.algo.hard;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContinuousMedianHandlerTest {

    private ContinuousMedianHandler handler;

    @Before
    public void setup(){
        handler = new ContinuousMedianHandler();
    }

    @Test
    public void TestCase1() {
        handler.insert(5);
        assertTrue(handler.getMedian() == 5);
        handler.insert(10);
        assertTrue(handler.getMedian() == 7.5);
    }

    @Test
    public void TestCase2() {
        handler.insert(5);
        handler.insert(10);
        assertTrue(handler.getMedian() == 7.5);
        handler.insert(100);
        assertTrue(handler.getMedian() == 10);
    }

    @Test
    public void TestCase3() {
        handler.insert(5);
        handler.insert(10);
        handler.insert(100);
        assertTrue(handler.getMedian() == 10);
        handler.insert(200);
        assertTrue(handler.getMedian() == 55);
    }

    @Test
    public void TestCase4() {
        handler.insert(5);
        handler.insert(10);
        handler.insert(100);
        handler.insert(200);
        handler.insert(6);
        assertTrue(handler.getMedian() == 10);
        handler.insert(13);
        assertTrue(handler.getMedian() == 11.5);
    }

}