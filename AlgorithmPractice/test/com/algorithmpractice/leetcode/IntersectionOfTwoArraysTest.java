package com.algorithmpractice.leetcode;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class IntersectionOfTwoArraysTest {

//	Input: nums1 = [1,2,2,1], nums2 = [2,2]
//			Output: [2,2]
//			Example 2:
//
//			Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//			Output: [4,9]

	private IntersectionOfTwoArrays i = new IntersectionOfTwoArrays();
	
	@Test
	public void test() {
		int[] nums1 = new int[] {1,2,2,1};
		int[] nums2 = new int[] {2,2};
		int[] expected = new int[] {2,2};
		assertThat(i.intersect(nums1, nums2), is(equalTo(expected)));
	}

}
