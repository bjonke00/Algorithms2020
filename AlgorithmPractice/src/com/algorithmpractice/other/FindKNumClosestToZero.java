package com.algorithmpractice.other;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class FindKNumClosestToZero {

    //questions - is it all positive data - need to use Absolute value
    //is it alsways two numbers or can it be find k numbers
    //are there duplicates in the arr - then we can't use value as key
    //do we have to return the values in any particular order
    //O(n) time and O(1) space
    public int[] findKNumClosestToZero(int[] arr){

        int min1 = arr[0];
        int min2 = arr[1];

        for(int i = 2; i < arr.length; i++){
            if(Math.abs(0 - min1) > Math.abs(0 - arr[i])){
                min1 = arr[i];
            }else if(Math.abs(0 - min2) > Math.abs(0 - arr[i])) {
                min2 = arr[i];
            }
        }

        return new int[]{min1, min2};
    }

    @Test
    public void testFinKNumClosestToZero(){
        int[] arr = {1,2,3,4,5,65,-100,100200,-20202,-1, 0};
        int[] expected = new int[]{0, -1};
        int[] actual = findKNumClosestToZero(arr);
        assertTrue(expected[0] == actual[0] && expected[1] == actual[1]);
    }
}
