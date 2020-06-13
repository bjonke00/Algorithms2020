package com.algorithmpractice.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SortedArrayParityII {

//    Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.
//    Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
//    You may return any answer array that satisfies this condition.

    public int[] sortArrayByParityII(int[] A) {
        Queue<Integer> odds = new LinkedList();
        Queue<Integer> evens = new LinkedList();
        int[] output = new int[A.length];

        for(int i=0; i<A.length; i++){
            if(A[i]%2==0) {
                evens.add(A[i]);
            }else{
                odds.add(A[i]);
            }
        }
        for(int i=0;i<A.length;i++){
            if (i%2==0 && evens.peek()!=null) {
                output[i] = evens.poll();
            }else if(i%2!=0 && odds.peek()!=null) {
                output[i] = odds.poll();
            }
        }

        return output;
    }
}
