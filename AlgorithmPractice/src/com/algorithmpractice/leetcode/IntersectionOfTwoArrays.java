package com.algorithmpractice.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {

	public int[] intersect(int[] nums1, int[] nums2) {
        int minLength = 0;
		if(nums1.length < nums2.length){
            minLength = nums1.length;
        }else{
            minLength = nums2.length;
        }
        List<Integer> resultList = new ArrayList<>();
        int count = 0;
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(resultList.size() < minLength && nums1[i] == nums2[j]) {
                    resultList.add(nums1[i]);
                }
            }
        }
        int[] resultArray = resultList.stream().mapToInt(i->i).toArray();

        return resultArray;
    }
	
}
