package com.algorithmpractice.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
// case where m >> n
// m = 1 ..10000 , n = 10001
// O(n*log(m)) and O(n) space
//    function findDuplicates(arr1, arr2):
//    duplicates = []
//
//            for number in arr1:
//            if binarySearch(arr2, number) != -1:
//            duplicates.push(number);
//
//    return duplicates
//
//
//    function binarySearch(arr, num):
//    begin = 0
//    end = arr.length - 1
//
//            while (begin <= end):
//    mid = begin + floor((end-begin)/2)
//            if arr[mid] < num:
//    begin = mid + 1
//            else if arr[mid] == num:
//            return mid
//        else:
//    end = mid - 1
//
//            return -1

    //O(n + m) time and O(n) space, where n < m
    static int[] findDuplicates(int[] arr1, int[] arr2) {
        List<Integer> duplicates = new ArrayList<>();
        int i = 0, j = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                duplicates.add(arr1[i]);
                i++;
                j++;
            }else if(arr1[i] < arr2[j]){
                i++;
            }else{
                j++;
            }
        }

        return listToArray(duplicates);
    }

    public static int[] listToArray(List<Integer> duplicatesList){
        int [] duplicatesArray = new int[duplicatesList.size()];
        int index = 0;
        for(Integer item : duplicatesList){
            duplicatesArray[index] = item;
            index++;
        }
        return duplicatesArray;
    }


    //O(n*m) time and O(1) space
    static int[] findDuplicatesBruteForce(int[] arr1, int[] arr2) {
        List<Integer> arr1List = new ArrayList<>();//Arrays.stream(arr2).boxed().collect(Collectors.toList());
        for(int i : arr1){
            arr1List.add(i);
        }
        List<Integer> arr2List = new ArrayList<>();//Arrays.stream(arr2).boxed().collect(Collectors.toList());
        for(int i : arr2){
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
