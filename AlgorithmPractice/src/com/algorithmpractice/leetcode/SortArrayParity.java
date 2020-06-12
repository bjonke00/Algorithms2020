package com.algorithmpractice.leetcode;

public class SortArrayParity {
//    Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
//    You may return any answer array that satisfies this condition.
//    O(n) time and space
    public int[] sortArrayByParity(int[] A) {
        int[] sortedA = new int[A.length];
        int i=0;
        int j=0;
        while(i<A.length){
            if(A[i]%2==0){
                sortedA[j] = A[i];
                j++;
            }
            i++;
        }
        i=0;
        while(i<A.length){
            if(A[i]%2!=0){
                sortedA[j] = A[i];
                j++;
            }
            i++;
        }
        return sortedA;
    }
}
