package com.algorithmpractice;

public class BinarySearch {

	public static int binarySearch(int[] array, int target) {
		return helper(array, target, 0, array.length - 1);
	}

//	public static int helper(int[] array, int target, int start, int end) {
//		if (start > end)
//			return -1;
//		int mid = (start + end) / 2;
//		if (target == array[mid])
//			return mid;
//		if (target < array[mid])
//			return helper(array, target, start, mid - 1);
//		else 
//			return helper(array, target, mid + 1, end);
//	}
	public static int helper(int[] array, int target, int start, int end) {
		while (start <= end) {
		int mid = (start + end) / 2;
		if (target == array[mid])
			return mid;
		if (target < array[mid])
			end = mid-1;
		else 
			start = mid+1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] a = new int[] { 1, 5, 23, 111 };
		System.out.println(binarySearch(a, 111));
	}

}
