package com.algorithmpractice.other;

import static org.junit.Assert.*;

import org.junit.Test;

public class DuplicateFinderTest {

    private DuplicateFinder duplicateFinder = new DuplicateFinder();

    @Test
    public void test1(){
        assertEquals(1, duplicateFinder.findDuplicate(new int[]{1,2,1,4,3,12}));
    }

    @Test
    public void test2(){
        assertEquals(9, duplicateFinder.findDuplicate(new int[]{6,1,9,5,3,4,9}));
    }

    @Test
    public void test3(){
        assertEquals(-1, duplicateFinder.findDuplicate(new int[]{2,1,3,4}));
    }
}
