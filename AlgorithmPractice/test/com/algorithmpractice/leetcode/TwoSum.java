package com.algorithmpractice.leetcode;

import java.util.HashMap;
import java.util.Map;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//        Example:
//        Given nums = [2, 7, 11, 15], target = 9,
//        Because nums[0] + nums[1] = 2 + 7 = 9,
//        return [0, 1].
public class TwoSum {
    //time O(n) / space O(n)
    public int[] twoSum(int[] nums, int target) {
        //define map where the key is the number from the given array
        //and the value is the index of the number
        //<Number,Index>
        Map<Integer,Integer> indexOfNumber = new HashMap();

        //loop through the given array
        for(int i=0; i<nums.length; i++){
            //see if target-number exists in indexOfNumber map
            //if it exists return the index of the current number
            //and the index of the number given from map
            if(indexOfNumber.get(target-nums[i])!=null){ //can use containsKey instead
                return new int[]{i,indexOfNumber.get(target-nums[i])};
            }else{
                //otherwise add the {number,index} key value pair to map
                indexOfNumber.put(nums[i],i);
            }
        }
        return new int[0];
    }
}
