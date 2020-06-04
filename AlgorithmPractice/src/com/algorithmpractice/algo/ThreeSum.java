package com.algorithmpractice.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
	
	public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
		List<Integer[]> sums = new ArrayList<>();
		List<Integer> sortedArray = sort(array);
		
		for(int i=0; i<sortedArray.size()-2; i++){
			int left = i+1;
			int right = sortedArray.size()-1;
			while(left<right){
				int sum = sortedArray.get(i)+sortedArray.get(left)+sortedArray.get(right);
				if(sum<targetSum)
					left++;
				if(sum>targetSum)
					right--;
				if(sum == targetSum){
					Integer[] triplet = new Integer[]{sortedArray.get(i), sortedArray.get(left), sortedArray.get(right)};
					sums.add(triplet);
					left++;
					right--;
				}
			}
		}
    return sums;
  }
	
	private static List<Integer> sort(int[] array){
		List<Integer> sortedArray = new ArrayList<>();
		for(int i : array) {
			sortedArray.add(i);
		}
		Collections.sort(sortedArray);
		return sortedArray;
	}
	
}
