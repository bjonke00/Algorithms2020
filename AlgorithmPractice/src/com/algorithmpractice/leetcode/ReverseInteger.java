package com.algorithmpractice.leetcode;


public class ReverseInteger {
	//Given a 32-bit signed integer, reverse digits of an integer.
	
	//O(logn)
	public int reverseInteger(int value) {
        int reversedInt = 0;
		
		boolean isNegative = false;
		if(value < 0) {
			value*=-1;
			isNegative = true;
		}
		
		while(value>0) {
            int rem = value%10;
            if (reversedInt > Integer.MAX_VALUE/10 || (reversedInt == Integer.MAX_VALUE / 10 && rem > 7)) return 0;
            if (reversedInt < Integer.MIN_VALUE/10 || (reversedInt == Integer.MIN_VALUE / 10 && rem < -8)) return 0;
			reversedInt = reversedInt*10 + rem;
			value/=10;
		}
		
		return isNegative?reversedInt*-1:reversedInt;
    }
	
	//O(n)
	public int reverseInteger1(int value) {
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
