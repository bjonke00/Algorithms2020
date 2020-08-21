package com.algorithmpractice.algo.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MaxSumIncreasingSubsequence {
    //O(n^2) time | O(n) space
    public static List<List<Integer>> maxSumIncreasingSubsequence(int[] array) {
        int length = array.length;
        int[] sequences = new int[length];
        Arrays.fill(sequences, Integer.MIN_VALUE);
        int[] sums = array.clone();
        int maxSumIdx = 0;
        for (int i = 0; i < length; i++) {
            int current = array[i];
            for (int j = 0; j < i; j++) {
                int other = array[j];
                if (other < current && sums[j] + current >= sums[i]) {
                    sums[i] = sums[j] + current;
                    sequences[i] = j;
                }
            }
            if (sums[i] > sums[maxSumIdx]) {
                maxSumIdx = i;
            }
        }
        return buildSequence(array, sequences, maxSumIdx, sums[maxSumIdx]);
    }

    private static List<List<Integer>> buildSequence(int[] array, int[] sequences,
                                                     int currentIdx, int sums) {
        List<List<Integer>> sequence = new ArrayList<List<Integer>>();
        sequence.add(Arrays.asList(sums));
        sequence.add(new ArrayList<Integer>());
        while (currentIdx != Integer.MIN_VALUE) {
            sequence.get(1).add(0, array[currentIdx]);
            currentIdx = sequences[currentIdx];
        }
        return sequence;
    }

}
