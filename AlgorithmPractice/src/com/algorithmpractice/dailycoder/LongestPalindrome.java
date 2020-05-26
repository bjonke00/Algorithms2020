package com.algorithmpractice.dailycoder;

//A palindrome is a sequence of characters that reads the same backwards and forwards. Given a string, s, find the longest palindromic substring in s.

public class LongestPalindrome {

	public boolean isPalindrome(String s){
		
		char[] palindrome = s.toCharArray(); 
		int size = palindrome.length;
        int j = size - 1;

		for(int i = 0; i < size/2; i++) {
            if(palindrome[i] != palindrome[j]){
                return false;
            }
            j--;
		}
		
		return true;
		
	}

    public String getLongestPalindrome(String s){

        int longest = 0;
        String palindrome = "";
        
        for(int i = 0; i < s.length(); i++){
            String substring = s.substring(i);
            if(isPalindrome(substring) && substring.length()>longest){
                palindrome = substring;
                longest = substring.length();
            }
        }

        for(int i = s.length(); i>0; i--){
            String substring = s.substring(0,i);
            if(isPalindrome(substring) && substring.length()>longest){
                palindrome = substring;
                longest = substring.length();
            }
        }
        
        return palindrome;

    }
    
    public static void main(String[] args) {
    	
    }
    
}
