package com.algorithmpractice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
//	Given two strings s and t , write a function to determine if t is an anagram of s.

	public boolean isValidAnagram(String str1, String str2) {
		
		Map<Character, Integer> charMap1 = new HashMap<>();
		Map<Character, Integer> charMap2 = new HashMap<>();
		
		for(int i=0; i<str1.length(); i++) {
			charMap1.put(str1.charAt(i), charMap1.getOrDefault(str1.charAt(i),0)+1);
		}
		
		for(int i=0; i<str2.length(); i++) {
			charMap2.put(str2.charAt(i), charMap2.getOrDefault(str2.charAt(i),0)+1);
		}
		
		for(Character i : charMap1.keySet()) {
			if(charMap1.get(i) != charMap2.get(i)) {
				return false;
			}
		}
		
		for(Character i : charMap2.keySet()) {
			if(charMap1.get(i) != charMap2.get(i)) {
				return false;
			}
		}
		
		return true;
	}
	
}
