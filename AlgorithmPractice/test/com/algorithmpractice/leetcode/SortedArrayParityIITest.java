package com.algorithmpractice.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SortedArrayParityIITest{

    private SortedArrayParityII sortedArrayParityII;

    @Before
    public void setup() {
        sortedArrayParityII = new SortedArrayParityII();
    }

    @Test
    public void test(){
        int[] input = new int[]{4,2,5,7};
        int[] output = new int[]{4,5,2,7};
        assertThat(sortedArrayParityII.sortArrayByParityII(input), is(equalTo(output)));
    }

//      [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.

}