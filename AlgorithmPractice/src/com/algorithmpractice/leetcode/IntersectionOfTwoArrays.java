package com.algorithmpractice.leetcode;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArrays {

	public int[] intersect(int[] nums1, int[] nums2) {
        int max = 0;
		if(nums1.length > nums2.length){
		    max = nums1.length;
        }else{
		    max = nums2.length;
        }
        int[] result = new int[max];
        int count = 0;
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j])
                    result[count] = nums1[i];
            }
        }
        return result;
    }
	
}
