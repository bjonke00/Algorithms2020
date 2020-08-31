package com.algorithmpractice.other;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class KthLargestNumber {

    //time O(nlogn) | space O(1)
    public static int findKthLargestNum(List<Integer> arr, int i) {
        Collections.sort(arr); // 1,2,3,4,5,6,7
        int kthLargestIdx = arr.size()-i;
        return arr.get(kthLargestIdx);
    }

    //using a heap -> O(mlogn) - you can use a PriorityQueue in java essentially a heap
    //try using partitioning -> O(n + n/2 + n/4 + n/8 + n/16) = O(2n) = O(n)

    @Test
    public void testKthLargestNumber(){
        List<Integer> arr = Arrays.asList(new Integer[]{5,7,2,3,4,1,6});
        assertEquals(5, findKthLargestNum(arr, 3));
    }
}
