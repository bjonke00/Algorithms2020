package com.algorithmpractice.algo.arrays.hard;

import javafx.application.Application;
import javafx.stage.Stage;

public class SubArraySort {

    public static int[] subarraySort(int[] array) {
        int minUnsorted = Integer.MAX_VALUE;
        int maxUnsorted = Integer.MIN_VALUE;

        for(int i=0; i<array.length; i++){
            if(isUnsorted(i, array)){
                minUnsorted = Math.min(minUnsorted, array[i]);
                maxUnsorted = Math.max(maxUnsorted, array[i]);
            }
        }

        if(minUnsorted == Integer.MAX_VALUE){
            return new int[]{-1,-1};
        }

        int start = 0;
        while(array[start] <= minUnsorted){
            start++;
        }

        int end = array.length - 1;
        while(array[end] >= maxUnsorted){
            end--;
        }

        return new int[]{start, end};
    }

    private static boolean isUnsorted(int i, int[] array){
        if(i == 0){
            return array[i] > array[i+1];
        }
        if(i == array.length-1){
            return array[i-1] > array[i];
        }
        return array[i-1] > array[i] || array[i] > array[i+1];
    }


}
