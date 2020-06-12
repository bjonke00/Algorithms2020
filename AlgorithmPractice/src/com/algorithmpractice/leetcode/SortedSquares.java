package com.algorithmpractice.leetcode;

import java.util.*;

public class SortedSquares {
//    Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

    //O(N)+2linkedLists time and space
    public int[] sortedSquares(int[] A) {
        Deque<Integer> negatives = new LinkedList();
        Queue<Integer> positives = new LinkedList();
        for(int i=0; i<A.length; i++){
            if(A[i]<0){
                negatives.push(Math.abs(A[i]));
            }else{
                positives.add(Math.abs(A[i]));
            }
        }

        int[] sortedSquares = new int[A.length];
        int i = 0;
        while(negatives.peek()!=null && positives.peek()!=null){
            if(negatives.peek()<=positives.peek()){
                int n = negatives.pop();
                sortedSquares[i] = n * n;
            }else if(negatives.peek()>positives.peek()){
                int n = positives.poll();
                sortedSquares[i] = n * n;
            }
            i++;
        }

        while(negatives.peek()!=null){
            int n = negatives.pop();
            sortedSquares[i] = n * n;
            i++;
        }
        while(positives.peek()!=null){
            int n = positives.poll();
            sortedSquares[i] = n * n;
            i++;
        }

        return sortedSquares;
    }

    //O(N) time and space
    public int[] sortedSquares2(int[] A) {
        int N = A.length;
        int j = 0;
        while (j < N && A[j] < 0)
            j++;
        int i = j-1;

        int[] ans = new int[N];
        int t = 0;

        while (i >= 0 && j < N) {
            if (A[i] * A[i] < A[j] * A[j]) {
                ans[t++] = A[i] * A[i];
                i--;
            } else {
                ans[t++] = A[j] * A[j];
                j++;
            }
        }

        while (i >= 0) {
            ans[t++] = A[i] * A[i];
            i--;
        }
        while (j < N) {
            ans[t++] = A[j] * A[j];
            j++;
        }

        return ans;
    }

    //NLogN time n space
    public int[] sortedSquares1(int[] A) {
        int N = A.length;
        int[] ans = new int[N];
        for (int i = 0; i < N; ++i)
            ans[i] = A[i] * A[i];

        Arrays.sort(ans);
        return ans;
    }
}
