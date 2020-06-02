package com.algorithmpractice.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScheduleCost {

    public int twoCitySchedCost(int[][] costs) {
    	Comparator<int[]> c = (a,b) -> Math.abs(b[0]-b[1]) - Math.abs(a[0]-a[1]);
    	Arrays.parallelSort(costs, c);

    	int halfSet = costs.length/2;
    	int total = 0;
    	int counter1 = 0;
    	int counter2 = 0;
    	int i = 0;
         while (i < 2*halfSet) {
             if ((costs[i][0] <= costs[i][1] && counter1 < halfSet) || counter2 == halfSet) {
                 total += costs[i++][0];
                 counter1++;
             } else {
                 total += costs[i++][1];
                 counter2++;
             }
         }
         return total;
    }
    
}
