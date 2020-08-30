package com.algorithmpractice.other;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMissingItem {
    //time O(n) | space O(1)
    public static int findMissingItem(int[] arr1, int[] arr2) {
        int sum = 0;
        for (int i : arr1) {
//            sum+=i;
            sum ^= i;
        }
        for (int i : arr2) {
//            sum-=i;
            sum ^= i;
        }
        return sum;
    }

    @Test
    public void test1() {
        int[] arr1 = {4, 12, 9, 5, 6};
        int[] arr2 = {4, 9, 12, 6};
        assertEquals(5, findMissingItem(arr1, arr2));
    }

    @Test
    public void test2() {
        int[] arr1 = {Integer.MAX_VALUE, Integer.MAX_VALUE,1};
        int[] arr2 = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        assertEquals(1, findMissingItem(arr1, arr2));
    }

}
