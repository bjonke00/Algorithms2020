package com.algorithmpractice.other;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateFinderTest {

    private DuplicateFinder duplicateFinder = new DuplicateFinder();

    @Test
    public void test1dup(){
        assertEquals(1, duplicateFinder.findDuplicate(new int[]{1,2,1,4,3,12}));
    }

    @Test
    public void test2dup(){
        assertEquals(9, duplicateFinder.findDuplicate(new int[]{6,1,9,5,3,4,9}));
    }

    @Test
    public void test3dup(){
        assertEquals(-1, duplicateFinder.findDuplicate(new int[]{2,1,3,4}));
    }

    @Test
    public void test1dups(){
        assertEquals(Arrays.asList(1, 12), duplicateFinder.findDuplicates(new int[]{1,2,1,4,3,12,12}));
    }

    @Test
    public void test2dups(){
        assertEquals(Arrays.asList(9, 9), duplicateFinder.findDuplicates(new int[]{6,1,9,5,3,4,9, 9}));
    }

    @Test
    public void test3dups(){
        assertEquals(new ArrayList(), duplicateFinder.findDuplicates(new int[]{2,1,3,4}));
    }
}
