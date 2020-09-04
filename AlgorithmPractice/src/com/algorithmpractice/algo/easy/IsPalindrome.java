package com.algorithmpractice.algo.easy;

public class IsPalindrome {

	//O(n) time / O(1) space ignore all non alphanumeric and case
	public boolean isPalindrome(String s) {
		s = s.toLowerCase();

		int left = 0;
		int right = s.length()-1;

		while(left<right){
			if(s.charAt(left)<'0' || (s.charAt(left)>'9'  && s.charAt(left)<'a') || s.charAt(left)>'z'){
				left++;
				continue;
			}
			if(s.charAt(right)<'0' || (s.charAt(right)>'9' && s.charAt(right)<'a') || s.charAt(right)>'z'){
				right--;
				continue;
			}
			if(s.charAt(left) != s.charAt(right)){
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

	//O(n) time ? / O(1) space ignore all non alphanumeric and case
	public boolean isPalindrome00(String s) {
		s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
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
		return str.equals(reversed);
	}
	
	//o(n) ts
	public boolean isPalindrome2(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i > -1; i--) {
			sb.append(str.charAt(i));
		}
		return str.equals(sb.toString());
	}
	
	//O(n) ts
	public static boolean isPalindrome1(String str) {
		StringBuilder sb = new StringBuilder(str);
		return sb.toString().equals(sb.reverse().toString());
	}
	
	//o(n) time and o(1) aka constant space aka optimal solution
	public boolean isPalindrome_pointers_from_outside(String str) {
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

	public boolean isPalindrome_pointers_from_center(String str) {
		//reverse the string, iterate through each string comparing if they are the same - n ts
		//n time constant space - 2 pointers moving into center or out from center, here I'll start from center
		int p1, p2=str.length()/2;
		if(str.length()%2 == 0){ // even
			p1 = p2 - 1;
		}else{ // odd
			p1 = p2;
		}
		while(p1 >= 0 && p2 < str.length()){
			if(str.charAt(p1) != str.charAt(p2))
				return false;
			p1--;
			p2++;
		}
		return true;
	}

}
