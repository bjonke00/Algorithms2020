package com.algorithmpractice.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

// 5-find-words-that-can-be-formed-by-characters
//You are given an array of strings words and a string chars.
//A string is good if it can be formed by characters from chars (each character can only be used once).
//Return the sum of lengths of all good strings in words.

//function countCharacters(words, chars) {
//}
//
//let words1 = ["cat","bt","hat","tree"];
//let chars1 = "atach";
//
//let words2 = ["hello","world","leetcode"];
//let chars2 = "welldonehoneyr";
//
//console.log(countCharacters(words1, chars1)); // 6
//console.log(countCharacters(words2, chars2)); // 10
public class WordsFormedByCharacters {
	
	//O(n^2)
	public int countCharacters(List<String> words, String chars) {
		StringBuilder wordsFoundInChars = new StringBuilder();
		List<Character> charsList = new ArrayList<>();
		
		for(int i=0;i<chars.length();i++) {
			charsList.add(chars.charAt(i));
		}
		
		for(String word : words) {
			List<Character> tempCharList = new ArrayList<>();
			tempCharList.addAll(charsList);
			if(isInChars(word, tempCharList)){
				wordsFoundInChars.append(word);
			}
		}
		
		return wordsFoundInChars.length();
	}

	private boolean isInChars(String word, List<Character> tempCharList) {
		for (int i = 0; i < word.length(); i++) {
			if (!tempCharList.contains(word.charAt(i))) {
				return false;
			}else {
				tempCharList.remove(tempCharList.indexOf(word.charAt(i)));
			}
		}
		return true;
	}

}
