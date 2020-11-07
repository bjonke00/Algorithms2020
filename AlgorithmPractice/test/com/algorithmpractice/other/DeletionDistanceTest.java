package com.algorithmpractice.other;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeletionDistanceTest {

    @Test
    public void test1(){
        assertEquals(3, DeletionDistance.deletionDistance("heat", "hit"));
    }

    @Test
    public void test2(){
        assertEquals(9, DeletionDistance.deletionDistance("some", "thing"));
    }

    @Test
    public void test3(){
        assertEquals(3, DeletionDistance.deletionDistance("seattle", "seat"));
    }

    @Test
    public void test4(){
        assertEquals(2, DeletionDistance.deletionDistance("dog", "fog"));
    }
}