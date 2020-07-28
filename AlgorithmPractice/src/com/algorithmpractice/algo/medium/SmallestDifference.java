package com.algorithmpractice.algo.medium;

import java.util.Arrays;

/*
    Write a function that takes two non-empty arrays of integers, finds the pair of numbers (one from ea. array)
    whose absolute difference is closest to zero, and returns an array containing the pair.
    Assume there is only one pair with the smallest difference.
 */
public class SmallestDifference {
    // O(nlogn) time & O(1) space
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        //sort arrays & use 2 pointers
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int p1 = 0;
        int p2 = 0;
        int smallest = Integer.MAX_VALUE;
        int current;
        int[] output = new int[2];
        while (p1 < arrayOne.length && p2 < arrayTwo.length) {
            int first = arrayOne[p1];
            int second = arrayTwo[p2];

            if (first == second) {
                return new int[]{first, second};
            } else if (first < second) {     //increment the pointer with the smaller number
                current = second - first;
                p1++;
            } else {
                current = first - second;
                p2++;
            }
            if (smallest > current) {     //keep track of the two numbers that have the smallest difference
                smallest = current;
                output = new int[]{first, second};
            }
        }
        return output;
    }

}
