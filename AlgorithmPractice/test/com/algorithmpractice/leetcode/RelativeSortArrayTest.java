package com.algorithmpractice.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class RelativeSortArrayTest {

    private RelativeSortArray relativeSortArray;

    @Before
    public void setup(){
        relativeSortArray = new RelativeSortArray();
    }

    @Test
    public void test(){
        int[] arr1 = new int[]{2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = new int[]{2,1,4,3,9,6};
        int[] output = new int[]{2,2,2,1,4,3,3,9,6,7,19};
        assertThat(relativeSortArray.relativeSortArray(arr1,arr2), is(equalTo(output)));
    }

}