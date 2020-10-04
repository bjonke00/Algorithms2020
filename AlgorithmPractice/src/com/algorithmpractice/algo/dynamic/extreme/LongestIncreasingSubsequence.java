package com.algorithmpractice.algo.dynamic.extreme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSubsequence {
    //O(n^2) time and O(n) space
    public static List<Integer> longestIncreasingSubsequence(int[] array) {
        //populate lengths and sequences, has reference to previous number in sequence
        int[] lengths = new int[array.length];
        Arrays.fill(lengths, 1);
        int[] sequences = new int[array.length];
        Arrays.fill(sequences, -1);
        int maxLengthIdx = 0;
        for (int i = 1; i < array.length; i++) {
            int currentNumber = array[i];
            for (int j = 0; j < i; j++) {
                int previousNumber = array[j];
                if (currentNumber > previousNumber && lengths[j] + 1 >= lengths[i]) {
                    lengths[i] = lengths[j] + 1;
                    sequences[i] = j;
                }
            }
            //get maxLengthIdx
            if (lengths[i] >= lengths[maxLengthIdx]) {
                maxLengthIdx = i;
            }
        }

        //populate list of longestSubsequence values
        List<Integer> longestSubsequence = new ArrayList<>();
        int currentIdx = maxLengthIdx;
        while (currentIdx != -1) {
            longestSubsequence.add(0, array[currentIdx]);
            currentIdx = sequences[currentIdx];
        }

        return longestSubsequence;
    }
}
