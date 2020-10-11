package com.algorithmpractice.amz;

import com.algorithmpractice.leetcode.PalindromeLinkedList;

import java.util.Objects;
import java.util.stream.IntStream;

public class FindMissingNumber {
    //time O(n) and space O(1)
    public int findMissingNumber(int[] ints) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < ints.length; i++){
            min = Math.min(min,ints[i]);
        }
        int expectedSum = min;
        for(int i = 0; i < ints.length + 1; i++){
            min++;
            expectedSum += min;
        }
        int actualSum = IntStream.of(ints).sum();
        return expectedSum - actualSum;
    }

}
