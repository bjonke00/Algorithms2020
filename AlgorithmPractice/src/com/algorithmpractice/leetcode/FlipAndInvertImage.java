package com.algorithmpractice.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FlipAndInvertImage {

//    Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
//    To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
//    To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].

    //O(n) time and O(1) space
    class Solution {
        public int[][] flipAndInvertImage(int[][] A) {
            int C = A[0].length;
            for (int[] row: A)
                for (int i = 0; i < (C + 1) / 2; ++i) {
                    int tmp = row[i] ^ 1;
                    row[i] = row[C - 1 - i] ^ 1;
                    row[C - 1 - i] = tmp;
                }

            return A;
        }
    }

    //O(n*m)*2 time and space (n*m)
    public int[][] flipAndInvertImage(int[][] A) {
        //flip/reverse the array
        List<Integer> flipped = new ArrayList();
        for(int i=0; i<A.length; i++){
            for(int j=A[i].length-1; j>-1; j--){
                flipped.add(A[i][j]);
            }
        }

        //invert ints in the array
        int count = 0;
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[i].length; j++){
                if(flipped.get(count)==0){
                    A[i][j]=1;
                }else{
                    A[i][j]=0;
                }
                count++;
            }
        }

        return A;
    }
}
