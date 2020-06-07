package com.algorithmpractice.algo;

public class IsPalindrome {

	//O(n) time / O(1) space ignore all non alphanumeric and case
	public boolean isPalindrome(String s) {
		s = s.toLowerCase().replaceAll("[^a-z]", "");
		int left = 0;
		int right = s.length()-1;

		while(left<right){
			if(s.charAt(left) != s.charAt(right)){
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

	//o(n^2) time and o(n) space
	public boolean isPalindrome3(String str) {
		String reversed = "";
		for (int i = str.length() - 1; i > -1; i--) {
			reversed+=str.charAt(i);
		}
		if (str.equals(reversed)) {
			return true;
		}
		return false;
	}
	
	//o(n) ts
	public boolean isPalindrome2(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i > -1; i--) {
			sb.append(str.charAt(i));
		}
		if (str.equals(sb.toString())) {
			return true;
		}
		return false;
	}
	
	//O(n) ts
	public static boolean isPalindrome1(String str) {
		StringBuilder sb = new StringBuilder(str);
		if (sb.toString().equals(sb.reverse().toString())) {
			return true;
		}
		return false;
	}
	
	//o(n) time and o(1) aka constant space aka optimal solution
	public boolean isPalindrome0(String str) {
		int left = 0;
		int right = str.length()-1;
		while(left < right){
			if(str.charAt(left) != str.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		return true;
  }

}
