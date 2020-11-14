package com.algorithmpractice.other;

public class PancakeSort {

    static void flip(int[] arr, int k){
        int begin = 0;
        int end = k;

        while(begin < end){
            swap(begin, end, arr);
            begin++;
            end--;
        }
    }

    static void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int getLargestIndex(int[] arr, int end){
        int max = -1;
        int maxIndex = -1;

        for(int i = 0; i <= end; i++){
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static int[] pancakeSort(int[] arr) {
        if(arr == null){
            throw new RuntimeException("You can't sort a null pancake!");
        }
        int end = arr.length - 1;
        for(int i = 1; i < arr.length; i++){
            int maxIndex = getLargestIndex(arr, end);
            flip(arr, maxIndex);
            flip(arr, end);
            end--;
        }

        return arr;
    }
}
