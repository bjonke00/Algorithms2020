package com.algorithmpractice.algo.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibinacciTest {

    private Fibinacci fib;

    @Before
    public void setup(){
        fib = new Fibinacci();
    }

    @Test
    public void TestCase9() {
        //0,1,1,2,3,5,8,13,21
        int expected = 21;
        int n = 9;
        assertAll(fib, expected, n);
    }

    @Test
    public void TestCase8() {
        //0,1,1,2,3,5,8,13
        int expected = 13;
        int n = 8;
        assertAll(fib, expected, n);
    }

    @Test
    public void TestCase7() {
        //0,1,1,2,3,5,8
        int expected = 8;
        int n = 7;
        assertAll(fib, expected, n);
    }

    @Test
    public void TestCase6() {
        //0,1,1,2,3,5
        int expected = 5;
        int n = 6;
        assertAll(fib, expected, n);
    }

    @Test
    public void TestCase5() {
        //0,1,1,2,3
        int expected = 3;
        int n = 5;
        assertAll(fib, expected, n);
    }

    @Test
    public void TestCase4() {
        //0,1,1,2
        int expected = 2;
        int n = 4;
        assertAll(fib, expected, n);
    }

    @Test
    public void TestCase3() {
        //0,1,1
        int expected = 1;
        int n = 3;
        assertAll(fib, expected, n);
    }

    @Test
    public void TestCase2() {
        //0,1
        int expected = 1;
        int n = 2;
        assertAll(fib, expected, n);
    }

    @Test
    public void TestCase1() {
        //0
        int expected = 0;
        int n = 1;
        assertAll(fib, expected, n);
    }

    private void assertAll(Fibinacci fib, int expected, int n) {
        assertEquals(expected, fib.getNthFib(n));
        assertEquals(expected, fib.getNthFib_memo(n));
        assertEquals(expected, fib.getNthFib_recursive(n));
    }
}