package com.algorithmpractice.other;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//6-unique-number-of-occurrences
//Given an array of integers arr, 
//write a function that returns true if and only if the number of occurrences of each value in the array is unique.

//function uniqueOccurrences(arr) {
//}
//
//console.log(uniqueOccurrences([1,2,2,1,1,3])); // true
////Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
//console.log(uniqueOccurrences([1,2])); // false
//console.log(uniqueOccurrences([-3,0,1,-3,1,1,1,-3,10,0])); // true
public class UniqueOccurrences {

	//O(n) time and space
	public boolean uniqueOccurrences(List<Integer> arr) {
		
		Map<Integer, Integer> mapOfNumberOfOccurrences = new HashMap<>();
		Set<Integer> uniqueNumbers = new HashSet<>();
		Set<Integer> uniqueOccurrences = new HashSet<>();
		
		for(Integer i : arr) {
			if(mapOfNumberOfOccurrences.get(i) == null) {
				mapOfNumberOfOccurrences.put(i, 1);
				uniqueNumbers.add(i);
			}else {
				mapOfNumberOfOccurrences.put(i,mapOfNumberOfOccurrences.get(i)+1);
			}
		}
		
		for(Integer i : uniqueNumbers) {
			if(uniqueOccurrences.contains(mapOfNumberOfOccurrences.get(i))) {
				return false;
			}else {
				uniqueOccurrences.add(mapOfNumberOfOccurrences.get(i));
			}
		}
		
		return true;
	}
	
}
