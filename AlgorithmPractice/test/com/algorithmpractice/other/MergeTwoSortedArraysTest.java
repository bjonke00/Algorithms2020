package com.algorithmpractice.other;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class MergeTwoSortedArraysTest {

    private MergeTwoSortedArrays mergeTwoSortedArrays;

    @Before
    public void setup(){
        mergeTwoSortedArrays = new MergeTwoSortedArrays();
    }

    @Test
    public void testMergeTwoSortedArrays(){
        int[] input1 = new int[]{3,4,7,8};
        int[] input2 = new int[]{1,5,6,9};
        int[] output = new int[]{1,3,4,5,6,7,8,9};
        assertThat(mergeTwoSortedArrays.mergeTwoSortedArrays(input1,input2), is(equalTo(output)));
    }

    @Test
    public void testMergeTwoSortedArrays1(){
        int[] input1 = new int[]{25};
        int[] input2 = new int[]{0,50,55,75,80,100};
        int[] output = new int[]{0,25,50,55,75,80,100};
        assertThat(mergeTwoSortedArrays.mergeTwoSortedArrays(input1,input2), is(equalTo(output)));
    }

    @Test
    public void testMergeTwoSortedArrays2(){
        int[] input1 = new int[]{0,1,2,2,3};
        int[] input2 = new int[]{0,1,2,2,3};
        int[] output = new int[]{0,0,1,1,2,2,2,2,3,3};
        assertThat(mergeTwoSortedArrays.mergeTwoSortedArrays(input1,input2), is(equalTo(output)));
    }

}