package com.algorithmpractice.algo.easy;

public class SelectionSort {
    //O(n^2) time & O(1) space
    public int[] selectionSort(int[] array) {
        if(array.length == 0){
            return new int[0];
        }
        for(int i=0; i<array.length-1; i++){
            int minIndex = i;
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[minIndex]){
                    minIndex = j;
                }
            }
            swap(minIndex,i, array);
        }
        return array;
    }

    private void swap(int minIndex, int i, int[] arr){
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
}
