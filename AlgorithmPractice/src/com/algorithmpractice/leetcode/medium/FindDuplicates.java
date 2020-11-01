package com.algorithmpractice.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
    // case where m >> n
// m = 1 ..10000 , n = 10001
// O(n*log(m)) and O(n) space
    static int[] findDuplicates(int[] arr1, int[] arr2) {
        List<Integer> duplicates = new ArrayList<>();
        int[] smaller;
        int[] larger;
        if (arr1.length <= arr2.length) {
            smaller = arr1;
            larger = arr2;
        } else {
            smaller = arr2;
            larger = arr1;
        }

        for (int i : smaller) {
            if (binarySearch(i, larger)) {
                duplicates.add(Integer.valueOf(i));
            }
        }

        return listToArray(duplicates);
    }

    static boolean binarySearch(int i, int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (i == arr[mid]) {
                return true;
            } else if (i < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }


    //O(n + m) time and O(n) space, where n < m
    static int[] findDuplicatesSimilarLengths(int[] arr1, int[] arr2) {
        List<Integer> duplicates = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                duplicates.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return listToArray(duplicates);
    }

    public static int[] listToArray(List<Integer> duplicatesList) {
        int[] duplicatesArray = new int[duplicatesList.size()];
        int index = 0;
        for (Integer item : duplicatesList) {
            duplicatesArray[index] = item;
            index++;
        }
        return duplicatesArray;
    }


    //O(n*m) time and O(1) space
    static int[] findDuplicatesBruteForce(int[] arr1, int[] arr2) {
        List<Integer> arr1List = new ArrayList<>();//Arrays.stream(arr2).boxed().collect(Collectors.toList());
        for (int i : arr1) {
            arr1List.add(i);
        }
        List<Integer> arr2List = new ArrayList<>();//Arrays.stream(arr2).boxed().collect(Collectors.toList());
        for (int i : arr2) {
            arr2List.add(i);
        }
        List<Integer> answerList = new ArrayList<>();
        for (int item : arr1) {
            if (arr2List.contains(item)) {
                answerList.add(item);
            }
        }
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.remove(0);
        }
        return answer;
    }

}
