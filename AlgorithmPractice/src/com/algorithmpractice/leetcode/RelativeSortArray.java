package com.algorithmpractice.leetcode;

import java.util.*;

public class RelativeSortArray {
//    Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
//    Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.  Elements that don't appear in arr2 should be placed at the end of arr1 in ascending order.

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        //create map of number to frequency -- key is number -- value is frequency
        Map<Integer,Integer> numberToFrequency = new TreeMap();

        //iterate through arr1 and add each number to map of number to frequency
        for(int i=0; i<arr1.length; i++){
            numberToFrequency.put(arr1[i],numberToFrequency.getOrDefault(arr1[i],0)+1);
        }

        //iterate through arr2
        //get the values from map and add to the output based on the frequency -- for ex. if a numbers frequency is 2 add it twice
        //remove number from map
        int[] output = new int[arr1.length];
        int j = 0;
        for(int i=0; i<arr2.length; i++){
            int frequency = numberToFrequency.get(arr2[i]);
            while(frequency>0){
                output[j] = arr2[i];
                frequency--;
                j++;
            }
            numberToFrequency.remove(arr2[i]);
        }

        //iterate through remaining numbers in map and add the remaining numbers to the output based on frequency
        Iterator it = numberToFrequency.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            int frequency = (Integer) entry.getValue();
            while(frequency>0){
                output[j] = (Integer) entry.getKey();
                j++;
                frequency--;
            }
        };

        return output;
    }

}
