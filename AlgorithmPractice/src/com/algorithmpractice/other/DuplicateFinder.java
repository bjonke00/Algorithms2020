package com.algorithmpractice.other;

import java.util.Arrays;

public class DuplicateFinder {
// No. 1 **array two pointers binary search**
// Write a function called findTheDuplicate which accepts an array
// of numbers containing a single duplicate.
// The function returns the number which is a duplicate or undefined
// if there are no duplicates.
    //O(nlog(n))
    public int findDuplicate(int[] arr) {
        if(arr.length<2)
            return -1;
        Arrays.sort(arr);
        int left =0;
        int right=1;
        while(right<arr.length){
            if(arr[left] == arr[right]){
                return arr[left];
            }
            left++;
            right++;
        }
        return -1;
    }

}
