package com.algorithmpractice.other;

import java.util.*;

public class DuplicateFinder {
    //O(n) time and space
    public int findDuplicate(int[] arr){
        Set<Integer> existing = new HashSet();

        for(int num : arr){
            if(existing.contains(num)){
                return num;
            }
            existing.add(num);
        }

        return -1;
    }


    //O(n) time and space
    public List<Integer> findDuplicates(int[] arr){
        Set<Integer> existing = new HashSet();
        List<Integer> dups = new ArrayList();

        for(int num : arr){
            if(existing.contains(num)){
                dups.add(num);
            }
            existing.add(num);
        }

        return dups;
    }


// No. 1 **array two pointers binary search**
// Write a function called findTheDuplicate which accepts an array
// of numbers containing a single duplicate.
// The function returns the number which is a duplicate or undefined
// if there are no duplicates.
    //O(nlog(n)) time & O(1) space
    public int findDuplicate1(int[] arr) {
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
