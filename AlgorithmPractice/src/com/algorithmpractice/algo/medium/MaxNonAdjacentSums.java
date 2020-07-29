package com.algorithmpractice.algo.medium;

public class MaxNonAdjacentSums {
    //O(n) time & O(1) space
    public int maxSubsetSumNoAdjacent(int[] array) {
        if(array.length==0){
            return 0;
        }else if(array.length==1){
            return array[0];
        }

        int p1 = array[0];
        int p2 = Math.max(array[0], array[1]);
        for(int i=2; i<array.length; i++){
            int current = Math.max(p2, p1+array[i]);
            p1 = p2;
            p2 = current;
        }

        return p2;
    }

    //O(n) time & O(n) space
    public int maxSubsetSumNoAdjacent1(int[] array) {
        if(array.length==0){
            return 0;
        }else if(array.length==1){
            return array[0];
        }

        int[] maxSums = array.clone(); // so that maxSums[0] = array[0] & maxSums[1] = array[1]
        maxSums[1] = Math.max(maxSums[0], maxSums[1]);
        for(int i=2; i<array.length; i++){
            maxSums[i] = Math.max(maxSums[i-1], maxSums[i-2]+maxSums[i]);
        }

        return maxSums[array.length-1];
    }

}
