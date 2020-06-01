package com.algorithmpractice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
//	Given two strings s and t , write a function to determine if t is an anagram of s.

	//O(n) time and O(1) space
	public boolean isValidAnagram(String str1, String str2) {
		
		int alphabet[] = new int[26];
		
		if(str1.length()!= str2.length())
			return false;
		
		for(int i=0; i<str1.length(); i++) {
			alphabet[str1.charAt(i)-'a']++;
		}
		
		for(int i=0; i<str2.length(); i++) {
			alphabet[str2.charAt(i)-'a']--;
		}
		
		for(int i : alphabet) {
			if(i!=0)
				return false;
		}
				
		return true;
	}
	
	//O(n) time and O(n) space
	public boolean isValidAnagram1(String str1, String str2) {
		
		Map<Character, Integer> charMap = new HashMap<>();
		
		if(str1.length()!= str2.length())
			return false;
		
		for(int i=0; i<str1.length(); i++) {
			charMap.put(str1.charAt(i), charMap.getOrDefault(str1.charAt(i),0)+1);
		}
		
		for(int i=0; i<str2.length(); i++) {
			charMap.put(str2.charAt(i), charMap.getOrDefault(str2.charAt(i),0)-1);
		}
		
		for(Character i : charMap.keySet()) {
			if(charMap.get(i) != 0) {
				return false;
			}
		}
				
		return true;
	}
	
}
