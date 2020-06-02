package com.algorithmpractice.leetcode;

import java.util.HashSet;
import java.util.Set;

public class GoatLatin {
//	A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and uppercase letters only.
//
//	We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)
//
//	The rules of Goat Latin are as follows:
//
//	If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
//	For example, the word 'apple' becomes 'applema'.
//	 
//	If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
//	For example, the word "goat" becomes "oatgma".
//	 
//	Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
//	For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
//	Return the final sentence representing the conversion from S to Goat Latin. 
	
	//O(n^2) time and space
	public String toGoatLatin(String S) {
        Set<Character> vowels = new HashSet();
        for(char c : new char[]{'a','e','i','o','u','A', 'E', 'I', 'O', 'U'})
            vowels.add(c);
        
        StringBuilder result = new StringBuilder();
        
        int total = 1;
        for(String word : S.split(" ")){
            if(vowels.contains(word.charAt(0))){
                result.append(word);
            }else{
                result.append(word.substring(1));
                result.append(word.substring(0,1));
            }
            result.append("ma");
            for(int i=0; i<total; i++)
                result.append("a");
            total++;
            result.append(" ");
        }
        
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
	
}
