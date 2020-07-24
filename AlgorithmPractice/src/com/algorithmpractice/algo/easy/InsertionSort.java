package com.algorithmpractice.algo.easy;

public class InsertionSort {
    //time O(n^2) / space O(1)
    public static int[] insertionSort(int[] array) {
        if(array.length == 0)
            return new int[0];

        for(int i=1; i<array.length; i++){
            int j = i;
            while(j > 0 && array[j-1] > array[j]){
                swap(j-1,j, array);
                j--;
            }
        }
        return array;
    }

    private static void swap(int i, int j, int[] array){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
