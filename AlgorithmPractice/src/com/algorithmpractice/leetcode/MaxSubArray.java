package com.algorithmpractice.leetcode;

public class MaxSubArray {
    //Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
    //O(n) time + O(1) space
    public static int kadanesAlgorithm(int[] array) {
        //max at the the current index
        int maxAtIndex = array[0];
        //overall max
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            //set max at the current index to whichever is greater : the number at the current index or the max at the previous index + the number at the current index
            maxAtIndex = Math.max(array[i], maxAtIndex + array[i]);
            //set the max to whichever is greater : the overall max or the max at the current index
            max = Math.max(max, maxAtIndex);
        }

        return max;
    }

}
