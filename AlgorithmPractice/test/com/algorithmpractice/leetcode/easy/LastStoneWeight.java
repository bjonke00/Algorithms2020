package com.algorithmpractice.leetcode.easy;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {
    //time nlogn / space n
    public int getLastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue(1000, new ReverseIntegerComparator());

        for(int stone : stones){
            pq.add(stone);
        }

        while(pq.size() > 1){
            int largestStone = pq.poll();
            int nextLargestStone = pq.poll();
            if(largestStone != nextLargestStone){
                pq.add(largestStone - nextLargestStone);
            }
        }

        return !pq.isEmpty() ? pq.poll() : 0;
    }

    public class ReverseIntegerComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer i1, Integer i2) {
            if (i1 < i2) {
                return 1;
            } else if (i1 > i2) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
