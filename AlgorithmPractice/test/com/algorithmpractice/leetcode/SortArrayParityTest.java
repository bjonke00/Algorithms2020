package com.algorithmpractice.leetcode;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

public class SortArrayParityTest {

    private SortArrayParity sortArrayParity;

    @Before
    public void setup(){
        sortArrayParity = new SortArrayParity();
    }

    @Test
    public void test(){
        int[] input = new int[]{3,1,2,4};
        int[] output = new int[]{2,4,3,1};
        assertThat(sortArrayParity.sortArrayByParity(input), is(equalTo(output)));
    }

// The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
}