package com.algorithmpractice.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
    public int findDuplicateFloydsAlgorithm(int[] nums) {
        //floyd's tortoise and hare (cycle detection)
        //O(n) time and O(1) space
        int tortoise = nums[0];
        int hare = nums[0];
        do {
            tortoise = nums[tortoise]; //move once, n + 1 == nums.length
            hare = nums[nums[hare]]; //move twice
        } while (hare != tortoise);

        //part2 find entrance to cycle
        tortoise = nums[0];
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }

        return hare;
    }

    public int findDuplicateUsingSet(int[] nums) {
        //O(n) time and O(n) space
        Set<Integer> nonDups = new HashSet();

        for (int n : nums) {
            if (!nonDups.add(n)) {
                return n;
            }
            nonDups.add(n);
        }

        return -1;
    }

    //Other way, which is less efficient is to use sorting : O(nlog(n)) time and O(1) space

    /*
    constraints :
    2 <= n <= 3 * 104
    nums.length == n + 1
    1 <= nums[i] <= n
    All the integers in nums appear only once except for precisely one integer which appears two or more times.
     */
}
