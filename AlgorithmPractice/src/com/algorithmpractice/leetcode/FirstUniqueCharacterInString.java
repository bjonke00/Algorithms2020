package com.algorithmpractice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {
//	Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

	//O(n) time and O(1) space
	public int findFirstUniqueCharacter(String str) {

		int alphabet[] = new int[26];

		for (int i = 0; i < str.length(); i++) {
			alphabet[str.charAt(i)-'a']++;
		}

		for (int i = 0; i < str.length(); i++) {
			if (alphabet[str.charAt(i)-'a'] == 1)
				return i;
		}

		return -1;
	}
	
	//O(n) time and O(n) space
	public int findFirstUniqueCharacter1(String str){
		
		Map<Character, Integer> uniqueCharMap = new HashMap<>();
		
		for(int i=0; i<str.length(); i++) {
			uniqueCharMap.put(str.charAt(i), uniqueCharMap.getOrDefault(str.charAt(i), 0)+1);
		}
		
		for(int i=0; i<str.length(); i++) {
			if(uniqueCharMap.get(str.charAt(i)) == 1)
				return i;
		}
		
		return -1;
	}
}
