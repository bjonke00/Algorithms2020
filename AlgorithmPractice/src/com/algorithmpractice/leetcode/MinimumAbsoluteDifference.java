package com.algorithmpractice.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.
Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows
a, b are from arr
a < b
b - a equals to the minimum absolute difference of any two elements in arr
 */
public class MinimumAbsoluteDifference {

    //time O(n) : space O(1)
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        //sort the array
        Arrays.sort(arr);
        int minDifference = Integer.MAX_VALUE;

        //traverse the array and find the absolute minimum difference
        for (int i = 0; i < arr.length - 1; i++) {
            int currentDifference = arr[i + 1] - arr[i];
            if (currentDifference < minDifference) {
                minDifference = currentDifference;
            }
        }

        List<List<Integer>> minDiffPairs = new ArrayList(); // output
        //traverse the array again to add all the pairs that are min pairs to the ouput
        for (int i = 0; i < arr.length - 1; i++) {
            int currentDifference = arr[i + 1] - arr[i];
            if (currentDifference == minDifference) {
                List<Integer> currentDiffPair = Arrays.asList(new Integer[]{arr[i], arr[i + 1]});
                minDiffPairs.add(currentDiffPair);
            }
        }

        return minDiffPairs;
    }
}
