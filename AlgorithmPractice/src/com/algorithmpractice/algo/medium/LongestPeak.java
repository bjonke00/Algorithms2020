package com.algorithmpractice.algo.medium;

public class LongestPeak {
    public int findLengthOflongestPeak(int[] array) {
        if(array.length < 3){
            return 0;
        }
        int longestPeak = 0;
        int i = 1;
        while(i<array.length-1){
            boolean isPeak = array[i-1]<array[i] && array[i]>array[i+1];
            if(!isPeak){
                i++;
                continue;
            }

            int p1 = i - 2;
            while(p1>=0 && array[p1]<array[p1+1]){
                p1--;
            }

            int p2 = i + 2;
            while(p2<array.length && array[p2-1]>array[p2]){
                p2++;
            }

            longestPeak = Math.max(longestPeak, p2-p1-1);
            i = p2;
        }
        return longestPeak;
    }
}
