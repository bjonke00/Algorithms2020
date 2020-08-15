package com.algorithmpractice.leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SplitBalancedStringsTest {

    private SplitBalancedStrings splitBalancedStrings;

    @Before
    public void setup(){
        splitBalancedStrings = new SplitBalancedStrings();
    }

    @Test
    public void test(){
        String s = "RLRRLLRLRL";
        assertEquals(4, splitBalancedStrings.splitBalancedStrings(s));
    }

    @Test
    public void test2(){
        String s = "RLLLLRRRLR";
        assertEquals(3, splitBalancedStrings.splitBalancedStrings(s));
    }

    @Test
    public void test3(){
        String s = "LLLLRRRR";
        assertEquals(1, splitBalancedStrings.splitBalancedStrings(s));
    }

    @Test
    public void test4() {
        String s = "RLRRRLLRLL";
        assertEquals(2, splitBalancedStrings.splitBalancedStrings(s));
    }

}