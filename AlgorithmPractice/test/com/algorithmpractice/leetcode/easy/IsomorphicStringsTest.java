package com.algorithmpractice.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsomorphicStringsTest {

    @Test
    public void test1(){
        IsomorphicStrings i = new IsomorphicStrings();
        assertFalse(i.isIsomorphic("ab","aa"));
    }

    @Test
    public void test2(){
        IsomorphicStrings i = new IsomorphicStrings();
        assertFalse(i.isIsomorphic("foo","bar"));
    }

    @Test
    public void test21(){
        IsomorphicStrings i = new IsomorphicStrings();
        assertFalse(i.isIsomorphic("aba","baa"));
    }

    @Test
    public void test3(){
        IsomorphicStrings i = new IsomorphicStrings();
        assertTrue(i.isIsomorphic("add","egg"));
    }

    @Test
    public void test4(){
        IsomorphicStrings i = new IsomorphicStrings();
        assertTrue(i.isIsomorphic("paper","title"));
    }

}