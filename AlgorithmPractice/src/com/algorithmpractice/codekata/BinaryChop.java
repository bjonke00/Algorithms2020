package com.algorithmpractice.codekata;


public class BinaryChop {

	public static int binaryChop(int i, int[] array) {
		return binaryChopHelper(i, 0, array.length-1, array);
	}
	
	private static int binaryChopHelper(int i, int begin, int end, int[] array) {
		if(begin>end)
			return -1;
		
		int midpoint = (end+begin)/2;
		
		if(i==array[midpoint]) {
			return midpoint;
		}else if(i<array[midpoint]) {
			return binaryChopHelper(i, begin, midpoint-1, array);
		}else {
			return binaryChopHelper(i, midpoint+1, end, array);
		}
		
	}
	
}
