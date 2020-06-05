package com.algorithmpractice.leetcode;

import java.util.ArrayList;
import java.util.List;

////7-lucky-numbers-in-a-matrix
////Given a m * n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
////A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
//
//function luckyNumbers(matrix) {
//}
//
//let matrix1 = [[3,7,8],[9,11,13],[15,16,17]];
//console.log(luckyNumbers(matrix1)); // [15]
////Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column
//
//let matrix2 = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
//console.log(luckyNumbers(matrix2)); // [12]
////Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
//
//let matrix3 = [[7,8],[1,2]]
//console.log(luckyNumbers(matrix3)); // [7]

//O(nx+my)
//where n is number of rows, x is the length of the rows, m is the number of col, y is the col length
public class LuckyNumbersInMatrix {

	public class Matrix{
		private List<List<Integer>> rows = new ArrayList<>();
		
		public Matrix() {
		}
		
		public void addRow(List<Integer> row) {
			this.rows.add(row);
		}
	}
	
	public Matrix createMatrix() {
		return new Matrix();
	}
	
	public List<Integer> findLuckyNumbers(Matrix matrix){
		List<Integer> luckyNumbers = new ArrayList<>();
		
		for(int i = 0; i< matrix.rows.size(); i++) {
			int minRowIndex = findMinRowIndex(matrix.rows.get(i));
			int maxInColumn = findMaxInMinRowIndexColumn(matrix.rows, matrix.rows.get(i), minRowIndex);
			if(matrix.rows.get(i).get(minRowIndex) == maxInColumn) {
				luckyNumbers.add(maxInColumn);
			}
		}
		
		return luckyNumbers;
	}
	
	private Integer findMinRowIndex(List<Integer> row) {
		int min = row.get(0);
		int minRowIndex = 0;
		for(int i=0; i<row.size(); i++) {
			if(row.get(i)<min) {
				min = row.get(i);
				minRowIndex = i;
			}
		}
		return minRowIndex;
	}
	
	private Integer findMaxInMinRowIndexColumn(List<List<Integer>> rows, List<Integer> row, int minRowIndex) {
		int max = row.get(minRowIndex);
		for(int i=0; i <rows.size();i++) {
			if(rows.get(i).get(minRowIndex)>max) {
				max = rows.get(i).get(minRowIndex);
			}
		}
		return max;
	}
	
}
