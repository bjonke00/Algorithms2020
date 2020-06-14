package com.algorithmpractice.other;

public class MergeTwoSortedArrays {
    //O(n) time & space
    public int[] mergeTwoSortedArrays(int[] input1, int[] input2) {
        int[] output = new int[input1.length + input2.length];

        int i = 0;
        int j = 0;
        int count = 0;

        while (i < input1.length && j < input2.length) {
            if (input1[i] < input2[j]) {
                output[count] = input1[i];
                i++;
            } else {
                output[count] = input2[j];
                j++;
            }
            count++;
        }

        while (i < input1.length) {
            output[count] = input1[i];
            i++;
            count++;
        }

        while (j < input2.length) {
            output[count] = input2[j];
            j++;
            count++;
        }

        return output;
    }
}
