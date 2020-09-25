package com.algorithmpractice.algo.dynamic.hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DiskStacking {

    //time O(n^2) and space O(n)
    public static List<Integer[]> diskStacking(List<Integer[]> disks) {
        Collections.sort(disks, new DiskHeightComparator());

        int[] heights = new int[disks.size()];
        int[] previousIdx = new int[disks.size()];
        int maxHeightIdx = 0;
        for(int i=0; i<disks.size(); i++){
            heights[i] = disks.get(i)[2];
            previousIdx[i] = -1;
            int currentHeight = heights[i];
            for(int j=0; j<i; j++){
                Integer[] currentDisk = disks.get(i);
                Integer[] otherDisk = disks.get(j);
                if(otherDisk[0] < currentDisk[0] && otherDisk[1] < currentDisk[1] && otherDisk[2] < currentDisk[2]){
                    if(currentHeight+heights[j] > heights[i]){
                        heights[i] = 	currentHeight+heights[j];
                        previousIdx[i] = j;
                    }
                }
            }
            if(heights[i] > heights[maxHeightIdx]){
                maxHeightIdx = i;
            }
        }

        List<Integer[]> result = new ArrayList<>();
        int i = maxHeightIdx;
        while(i > -1){
            result.add(0, disks.get(i));
            i = previousIdx[i];
        }


        return result;
    }

    public static class DiskHeightComparator implements Comparator<Integer[]> {
        public int compare(Integer[] disk1, Integer[] disk2){
            if(disk1[2] > disk2[2]){
                return 1;
            }else if(disk1[2] < disk2[2]){
                return -1;
            }else{
                return 0;
            }
        }
    }
}
