package com.algorithmpractice.other;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.algorithmpractice.other.LuckyNumbersInMatrix.Matrix;

public class LuckyNumbersInMatrixTest {
//	/let matrix1 = [[3,7,8],[9,11,13],[15,16,17]];
	//console.log(luckyNumbers(matrix1)); // [15]
	////Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column
	//
	//let matrix2 = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
	//console.log(luckyNumbers(matrix2)); // [12]
	////Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
	//
	//let matrix3 = [[7,8],[1,2]]
	//console.log(luckyNumbers(matrix3)); // [7]
	
	private LuckyNumbersInMatrix lnim = new LuckyNumbersInMatrix();
	
	@Test
	public void test1() {
		Matrix matrix =  lnim.createMatrix();
		matrix.addRow(Arrays.asList(new Integer[] {3,7,8}));
		matrix.addRow(Arrays.asList(new Integer[] {9,11,13}));
		matrix.addRow(Arrays.asList(new Integer[] {15,16,17}));
		
		List<Integer> expectedLuckyNumbers = Arrays.asList(new Integer[] {15});
		List<Integer> luckyNumbers = lnim.findLuckyNumbers(matrix);
		assertEquals(expectedLuckyNumbers, luckyNumbers);
	}

	@Test
	public void test2() {
		Matrix matrix =  lnim.createMatrix();
		matrix.addRow(Arrays.asList(new Integer[] {1,10,4,2}));
		matrix.addRow(Arrays.asList(new Integer[] {9,3,8,7}));
		matrix.addRow(Arrays.asList(new Integer[] {15,16,17,12}));
		
		List<Integer> expectedLuckyNumbers = Arrays.asList(new Integer[] {12});
		List<Integer> luckyNumbers = lnim.findLuckyNumbers(matrix);
		assertEquals(expectedLuckyNumbers, luckyNumbers);
	}
	
	@Test
	public void test3() {
		Matrix matrix =  lnim.createMatrix();
		matrix.addRow(Arrays.asList(new Integer[] {7,8}));
		matrix.addRow(Arrays.asList(new Integer[] {1,2}));
		
		List<Integer> expectedLuckyNumbers = Arrays.asList(new Integer[] {7});
		List<Integer> luckyNumbers = lnim.findLuckyNumbers(matrix);
		assertEquals(expectedLuckyNumbers, luckyNumbers);
	}
}
