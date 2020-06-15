package com.algorithmpractice.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FlipAndInvertImageTest {

    private FlipAndInvertImage flipAndInvertImage;

    @Before
    public void setup(){
        flipAndInvertImage = new FlipAndInvertImage();
    }

    @Test
    public void test1(){
        int[][] input = new int[][]{{1,1,0},{1,0,1},{0,0,0}};
        int[][] output = new int[][]{{1,0,0},{0,1,0},{1,1,1}};
        assertThat(flipAndInvertImage.flipAndInvertImage(input), is(equalTo(output)));
    }
    @Test
    public void test2(){
        int[][] input = new int[][]{{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int[][] output = new int[][]{{1,1,0,0},{0,1,1,0},{0,0,0,1},{1,0,1,0}};
        assertThat(flipAndInvertImage.flipAndInvertImage(input), is(equalTo(output)));
    }



}