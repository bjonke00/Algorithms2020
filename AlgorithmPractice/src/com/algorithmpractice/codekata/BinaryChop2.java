package com.algorithmpractice.codekata;

public class BinaryChop2 {

	public int binaryChop(int i, int[] array) {
		int begin = 0;
		int end = array.length-1;
		
		while(begin<=end) {
			int midpoint = (begin+end)/2;
			if(i == array[midpoint]) {
				return midpoint;
			}else if(i<array[midpoint]) {
				end = midpoint - 1;
			}else {
				begin = midpoint + 1;
			}
		}
		
		return -1;
	}
}
