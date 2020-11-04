package com.algorithmpractice.leetcode.medium;

import java.util.PriorityQueue;

public class LongestSubarray {
    //O(nlog(m)) time and O(m) space - where n is the length of nums and m is the size of the priority queue (inserting and removing from the priority queue is log(m))
    public int longestSubarray(int[] nums, int limit) {
        int left = 0;
        int right = 0;
        int longestSubarray = 1;
        PriorityQueue<Integer> min = new PriorityQueue<>((i1, i2) -> i1 - i2);
        PriorityQueue<Integer> max = new PriorityQueue<>((i1,i2) -> i2 - i1);

        while(right < nums.length){
            min.add(nums[right]);
            max.add(nums[right]);
            if(Math.abs(max.peek() - min.peek()) <= limit){
                longestSubarray = Math.max(longestSubarray, right - left + 1);
            }else{
                min.remove(nums[left]);
                max.remove(nums[left]);
                left++;
            }
            right++;
        }

        return longestSubarray;
    }
}
