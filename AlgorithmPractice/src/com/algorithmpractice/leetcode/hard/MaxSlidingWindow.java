package com.algorithmpractice.leetcode.hard;

import java.util.Deque;
import java.util.LinkedList;

public class MaxSlidingWindow {
    //O(n) time and O(n) space
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] maxValues = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList();

        for(int right = 0; right < nums.length; right++){
            //maintain descending ordered queue
            //to get max at constant time
            while(!deque.isEmpty() && nums[deque.peekLast()] <= nums[right]){
                deque.pollLast();
            }

            //add each index to end of the queue
            deque.offer(right);

            //maintain the range left -> right on queue
            int left = deque.peek();
            if(right - left == k){
                deque.poll();
            }

            //add the current max value
            if(right >= k - 1){
                maxValues[right - k + 1] = nums[deque.peek()];
            }
        }

        return maxValues;
    }

    //O(n*k) time and O(n) space
    public static int[] maxSlidingWindow_bruteforce(int[] nums, int k) {
        int left = 0;
        int right = k - 1;
        int maxValues[] = new int[nums.length - k + 1];
        while(right < nums.length){
            int i = left;
            int max = Integer.MIN_VALUE;
            while(i <= right){
                if(nums[i] > max){
                    max = nums[i];
                }
                i++;
            }
            maxValues[left] = max;
            left++;
            right++;
        }
        return maxValues;
    }
}
