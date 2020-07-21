package com.algorithmpractice.leetcode.easy;

public class LineIsStraight {
    public boolean checkStraightLine(int[][] coordinates) {
        int x = coordinates[1][0] - coordinates[0][0];
        int y = coordinates[1][1]- coordinates[0][1];

        for(int i=0; i<coordinates.length-1; i++){
            if(!isLinear(coordinates[i],coordinates[i+1], x, y)){
                return false;
            }
        }
        return true;
    }

    //check all the slopes are the same as the baseline slope
    private boolean isLinear(int[] p1, int[] p2, int x, int y){
        int x1 = p1[0], y1 = p1[1], x2 = p2[0], y2 = p2[1];

        //make sure not to divide by zero
        if(x2-x1 == 0 || x == 0){
            if(x == x2-x1)
                return true;
            return false;
        }

        return (y2-y1)/(x2-x1) == y/x;
    }
}
