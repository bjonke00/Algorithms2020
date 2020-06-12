package com.algorithmpractice.leetcode;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;

public class SortedSquaresTest {

    private SortedSquares sortedSquares;

    @Before
    public void setup(){

    }

    @Test
    public void test1(){
        int[] input = new int[]{-4,-1,0,3,10};
        int[] output = new int[]{0,1,9,16,100};
        assertThat(sortedSquares.sortedSquares(input),is(equalTo(output)));
    }

    @Test
    public void test2(){
        int[] input = new int[]{-7,-3,2,3,11};
        int[] output = new int[]{4,9,9,49,121};
        assertThat(sortedSquares.sortedSquares(input),is(equalTo(output)));
    }

}