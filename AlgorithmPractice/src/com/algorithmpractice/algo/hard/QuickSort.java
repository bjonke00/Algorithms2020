package com.algorithmpractice.algo.hard;

public class QuickSort {
    //Best : O(nlog(n)) time | O(log(n)) space
    //Average : O(nlog(n)) time | O(log(n)) space
    //Worst : O(n^2) time | O(log(n)) space
    public static int[] quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    static void quickSort(int[] array, int startIdx, int endIdx) {
        if (startIdx >= endIdx) {
            return;
        }
        int pivot = startIdx;
        int leftIdx = startIdx + 1, rightIdx = endIdx;
        while (leftIdx <= rightIdx) {
            if (array[pivot] < array[leftIdx] && array[pivot] > array[rightIdx]) {
                swap(leftIdx, rightIdx, array);
            }
            if (array[pivot] >= array[leftIdx]) {
                leftIdx++;
            }
            if (array[pivot] <= array[rightIdx]) {
                rightIdx--;
            }
        }
        swap(pivot, rightIdx, array);
        boolean leftSubarrayIsSmaller = rightIdx - 1 - startIdx < endIdx - (rightIdx + 1);
        if (leftSubarrayIsSmaller) {
            quickSort(array, startIdx, rightIdx - 1);
            quickSort(array, rightIdx + 1, endIdx);
        } else {
            quickSort(array, rightIdx + 1, endIdx);
            quickSort(array, startIdx, rightIdx - 1);
        }
    }

    static void swap(int l, int r, int[] arr) {
        int tmp = arr[l];
        arr[l] = arr[r];
        arr[r] = tmp;
    }
}
