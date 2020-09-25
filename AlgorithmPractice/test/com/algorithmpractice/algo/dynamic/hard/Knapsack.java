package com.algorithmpractice.algo.dynamic.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Knapsack {
    //time O(i*c) space O(i*c)
    public static List<List<Integer>> knapsackProblem(int[][] items, int capacity) {
        int[][] knapsackValues = new int[items.length +1][capacity + 1];
        for(int i=1; i<items.length + 1; i++){
            int currentWeight = items[i - 1][1];
            int currentValue = items[i - 1][0];
            for(int c=0; c<capacity+1; c++){
                if(currentWeight > c){
                    knapsackValues[i][c] = knapsackValues[i-1][c];
                }else{
                    knapsackValues[i][c] =
                            Math.max(
                                    knapsackValues[i-1][c],
                                    knapsackValues[i-1][c-currentWeight]+currentValue);
                }
            }
        }

        List<Integer> totalWeight = Arrays.asList(knapsackValues[items.length][capacity]);
        List<Integer> finalItems = new ArrayList<>();
        int i = knapsackValues.length - 1;
        int c = knapsackValues[0].length - 1;
        while(i>0){
            if(knapsackValues[i][c] == knapsackValues[i-1][c]){
                i--;
            }else{
                finalItems.add(0, i-1);
                c-=items[i-1][1];
                i--;
            }
            if(c==0)
                break;
        }

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(totalWeight);
        result.add(finalItems);
        return result;
    }
}
