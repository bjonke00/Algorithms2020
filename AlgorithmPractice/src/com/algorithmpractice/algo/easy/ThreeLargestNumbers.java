package com.algorithmpractice.algo.easy;

public class ThreeLargestNumbers {
    public static int[] findThreeLargestNumbers(int[] array) {
        int max1=Integer.MIN_VALUE, max2=Integer.MIN_VALUE, max3=Integer.MIN_VALUE;
        for(int i: array){
            if(i > max1){
                max3 = max2;
                max2 = max1;
                max1 = i;
            }else if(i > max2){
                max3 = max2;
                max2 = i;
            }else if(i > max3){
                max3 = i;
            }
        }
        return new int[]{max3, max2, max1};
    }
}
