package com.algorithmpractice.algo.easy;

import static org.junit.Assert.*;

import org.junit.Test;

import com.algorithmpractice.algo.easy.BinarySearch;

public class BinarySearchTest {

private BinarySearch binaryChop = new BinarySearch();
	
	
	@Test
	public void test1() {
		assertEquals(3, binaryChop.binarySearch(new int[] { 0, 1, 21, 33, 45, 45, 61, 71, 72, 73 }, 33));
	}
	@Test
	public void test2() {
		assertEquals(3, binaryChop.binarySearch(new int[] { 1, 5, 23, 111 }, 111));
	}
	@Test
	public void test3() {
		assertEquals(1, binaryChop.binarySearch(new int[] { 1, 5, 23, 111 }, 5));
	}
	@Test
	public void test4() {
		assertEquals(-1, binaryChop.binarySearch(new int[] { 1, 5, 23, 111 }, 35));
	}
	@Test
	public void test5() {
		assertEquals(8, binaryChop.binarySearch(new int[] { 0, 1, 21, 33, 45, 45, 61, 71, 72, 73 }, 72));
	}
	@Test
	public void test6() {
		assertEquals(9, binaryChop.binarySearch(new int[] { 0, 1, 21, 33, 45, 45, 61, 71, 72, 73 }, 73));
	}
	@Test
	public void test7() {
		assertEquals(-1, binaryChop.binarySearch(new int[] { 0, 1, 21, 33, 45, 45, 61, 71, 72, 73 }, 70));
	}
	@Test
	public void test8() {
		assertEquals(10, binaryChop.binarySearch(new int[] { 0, 1, 21, 33, 45, 45, 61, 71, 72, 73, 355 }, 355));
	}
	@Test
	public void test9() {
		assertEquals(-1, binaryChop.binarySearch(new int[] { 0, 1, 21, 33, 45, 45, 61, 71, 72, 73, 355 }, 354));
	}

}
