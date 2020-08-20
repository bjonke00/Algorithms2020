package com.algorithmpractice.algo.medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MinHeapTest {
//    @Test
    public void TestCase1() {
        List<Integer> array = Arrays.asList(48, 12, 24, 7, 8, -5, 24, 391, 24, 56, 2, 6, 8, 41);
        MinHeap minHeap = new MinHeap(array);
        minHeap.insert(76);
        assertTrue(isMinHeapPropertySatisfied(minHeap.heap));
        assertTrue(minHeap.peek() == -5);
        assertTrue(minHeap.remove() == -5);
        assertTrue(isMinHeapPropertySatisfied(minHeap.heap));
        assertTrue(minHeap.peek() == 2);
        assertTrue(minHeap.remove() == 2);
        assertTrue(isMinHeapPropertySatisfied(minHeap.heap));
        assertTrue(minHeap.peek() == 6);
        minHeap.insert(87);
        assertTrue(isMinHeapPropertySatisfied(minHeap.heap));
    }

    boolean isMinHeapPropertySatisfied(List<Integer> array) {
        for (int currentIdx = 1; currentIdx < array.size(); currentIdx++) {
            int parentIdx = (currentIdx - 1) / 2;
            if (parentIdx < 0) {
                return true;
            }
            if (array.get(parentIdx) > array.get(currentIdx)) {
                return false;
            }
        }

        return true;
    }

}