package com.algorithmpractice.leetcode;

//Given a 32-bit signed integer, reverse digits of an integer.
public class ReverseInteger {

	public int reverseInteger(int value) {
		System.out.println(-123%10);
		int reversedInt = 0;
		
		boolean isNegative = false;
		if(value < 0) {
			value*=-1;
			isNegative = true;
		}
		
		while(value>0) {
			reversedInt = reversedInt*10 + value%10;
			value/=10;
		}
		
		return isNegative?reversedInt*-1:reversedInt;
	}

}
