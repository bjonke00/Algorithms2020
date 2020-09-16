package com.algorithmpractice.algo.arrays.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FourSums {
    //O(n^2) time | O(n^2) space
    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        List<Integer[]> result = new ArrayList<>();
        Map<Integer, List<Integer[]>> pairSums = new HashMap<>();

        for(int i=0; i<array.length-1; i++){
            for(int j=i+1; j<array.length; j++){
                int currentSum = array[i] + array[j];
                int diff = targetSum - currentSum;
                if(pairSums.containsKey(diff)){
                    for(Integer[] diffPair : pairSums.get(diff)){
                        Integer[] quad = {array[i], array[j], diffPair[0], diffPair[1]};
                        result.add(quad);
                    }
                }
            }
            for(int k=0; k<i; k++){
                int currentSum = array[i] + array[k];
                Integer[] pair = {array[i], array[k]};
                if(!pairSums.containsKey(currentSum)){
                    List<Integer[]> pairSum = new ArrayList<>();
                    pairSum.add(pair);
                    pairSums.put(currentSum, pairSum);
                }else{
                    pairSums.get(currentSum).add(pair);
                }
            }
        }

        return result;
    }

    //O(n^4) time | O(1) space
    public static List<Integer[]> fourNumberSum_bruteforce(int[] array, int targetSum) {
        List<Integer[]> result = new ArrayList<>();

        for(int i=0; i<array.length-3; i++){
            for(int j=i+1; j<array.length-2; j++){
                for(int k=j+1; k<array.length-1; k++){
                    for(int l=k+1; l<array.length; l++){
                        int sum = array[i] + array[j] + array[k] + array[l];
                        if(sum == targetSum){
                            Integer[] sums = {array[i], array[j], array[k], array[l]};
                            result.add(sums);
                        }
                    }
                }
            }
        }

        return result;
    }
}
