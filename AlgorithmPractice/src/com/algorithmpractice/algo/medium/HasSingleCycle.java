package com.algorithmpractice.algo.medium;

/*Return true if the jumps in the array form a single cycle.
 * For example, 2 represents a jump of 2 indices forward, -2 represents a jump back 2.
 * If a jump spills out of bounds it wraps around to the other side.*/
public class HasSingleCycle {
    //time O(n) space O(1)
    public boolean hasSingleCycle(int[] array) {
        int countOfVisited = 0;
        int currIndex = 0;
        while (countOfVisited < array.length) {
            if (countOfVisited > 0 && currIndex == 0) {
                return false;
            }
            countOfVisited++;
            currIndex = getNextIndex(currIndex, array);
        }
        return currIndex == 0;
    }

    private int getNextIndex(int currIndex, int[] array) {
        int jump = array[currIndex];
        int nextIndex = (currIndex + jump) % array.length;
        return nextIndex >= 0 ? nextIndex : nextIndex + array.length;
    }

}
