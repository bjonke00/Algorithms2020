package com.algorithmpractice.algo.hard;

import java.util.PriorityQueue;

/*Supports a continuous insertion of numbers that allow a constant time retrieval of the median of numbers inserted thus far.*/
//time O(log(n)) | space O(n)
public class ContinuousMedianHandler {
    double median = 0;
    boolean odd;
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>();

    public void insert(int number) {
        odd = !odd;
        if (!maxHeap.isEmpty() && number > maxHeap.peek() * (-1)) {
            minHeap.add(number);
        } else {
            maxHeap.add(number * (-1));
        }

        if (minHeap.size() - maxHeap.size() > 1) {
            maxHeap.add(minHeap.poll() * (-1));
        } else if (maxHeap.size() - minHeap.size() > 1) {
            minHeap.add(maxHeap.poll() * (-1));
        }

    }

    public double getMedian() {
        if (odd) {
            return minHeap.size() > maxHeap.size() ? minHeap.peek() : maxHeap.peek() * (-1);
        } else {
            return ((double) minHeap.peek() + (double) maxHeap.peek() * (-1)) / 2;
        }
    }

    // static class IntegerComparator implements Comparator<Integer>{
    // 	public int compare(Integer i, Integer j){
    // 		if(i < j){
    // 			return 1;
    // 		}else if(i > j){
    // 			return -1;
    // 		}else{
    // 			return 0;
    // 		}
    // 	}
    // }

}
