package com.algorithmpractice.algo.veryhard;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MergeSortedArrays {
    //time O(nlog(k)) where n is the total number of array elements
    //and k is the number of arrays
    //using a priority queue as an easy work around instead of coding a heap from scratch
    public List<Integer> mergeSortedArrays(List<List<Integer>> arrays) {
        List<Integer> sortedList = new ArrayList();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int[] indices = new int[arrays.size()];

        while (true) {
            for (int i=0; i<arrays.size(); i++) {
                if (indices[i] < arrays.get(i).size()) {
                    minHeap.add(arrays.get(i).get(indices[i]));
                    indices[i]++;
                }
            }
            if (!minHeap.isEmpty()) {
                sortedList.add(minHeap.poll());
            } else {
                return sortedList;
            }
        }
    }

    //originally getting unsupportedOperationException when removing from list since Arrays.asList apparently returns an immutable list!
    //Therefore need to keep track of indices as done in above solution
    public static List<Integer> mergeSortedArrays_old(List<List<Integer>> arrays) {
        List<Integer> sortedList = new ArrayList<Integer>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        while(true){
            for(List<Integer> arr : arrays){
                if(!arr.isEmpty()){
                    minHeap.add(arr.get(0));
                    arr.remove(0);
                }
            }
            if(!minHeap.isEmpty()){
                sortedList.add(minHeap.poll());
            }else{
                return sortedList;
            }
        }
    }
}
