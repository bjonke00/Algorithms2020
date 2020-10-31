package com.algorithmpractice.algo.dynamic.medium;

public class LongestAdjacentOnes {
    //O(n) time and space
    public static int longestStreakOfAdjacentOnes(int[] array) {
        int potentialMax[] = new int[array.length];
        int actualMax[] = new int[array.length];
        int longestStreak = Integer.MIN_VALUE;
        int longestStreakIdx = 0;
        int lastZeroIdx = Integer.MIN_VALUE;

        potentialMax[0] = 1;
        if(array[0] == 0){
            actualMax[0] = 0;
            lastZeroIdx = 0;
        }else{
            actualMax[0] = 1;
        }

        for(int i = 1; i < array.length; i++){
            if(array[i] == 0){
                actualMax[i] = 0;
                potentialMax[i] = actualMax[i - 1] + 1;
                lastZeroIdx = i;
            }else{
                actualMax[i] = actualMax[i - 1] + 1;
                potentialMax[i] = potentialMax[i - 1] + 1;
            }
            if(potentialMax[i] > longestStreak){
                longestStreak = potentialMax[i];
                longestStreakIdx = lastZeroIdx;
            }
        }

        return lastZeroIdx == Integer.MIN_VALUE ? -1 : longestStreakIdx;
    }
}
