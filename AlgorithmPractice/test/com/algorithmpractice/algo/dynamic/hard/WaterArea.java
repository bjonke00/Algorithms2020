package com.algorithmpractice.algo.dynamic.hard;

import java.util.stream.IntStream;

public class WaterArea {
    //time O(n) | space O(n)
    public static int waterArea(int[] heights) {
        if(heights.length < 1)
            return 0;

        int[] right = new int[heights.length];
        right[0] = heights[0];
        for(int i=1; i<heights.length; i++){
            right[i] = Math.max(right[i-1], heights[i]);
        }

        int[] left = new int[heights.length];
        left[heights.length-1] = heights[heights.length-1];
        for(int i=heights.length-2; i>=0; i--){
            left[i] = Math.max(left[i+1], heights[i]);
        }

        int[] min = new int[heights.length];
        for(int i=0; i<min.length; i++){
            min[i] = Math.min(right[i], left[i]);
        }

        int[] waterArea = new int[heights.length];
        for(int i=0; i<waterArea.length; i++){
            waterArea[i] = min[i] - heights[i];
        }

        return IntStream.of(waterArea).sum();
    }
}
