package com.algorithmpractice.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class ReshapeMatrix {

	public int[][] matrixReshape(int[][] nums, int r, int c) {
		if (nums.length * nums[0].length != r * c)
			return nums;

		Queue<Integer> queue = new LinkedList();
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				queue.add(nums[i][j]);
			}
		}

		int[][] reshaped = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				reshaped[i][j] = queue.poll();
			}
		}
		
		return reshaped;
	}
	
}
