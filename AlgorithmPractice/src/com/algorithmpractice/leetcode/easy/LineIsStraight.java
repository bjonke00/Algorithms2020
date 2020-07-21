package com.algorithmpractice.leetcode.easy;

public class LineIsStraight {
        public boolean checkStraightLine(int[][] coordinates) {
            for(int i=0; i<coordinates.length-1; i++){
                if(!isLinear(coordinates[i][0],coordinates[i][1],coordinates[i+1][0],coordinates[i+1][1])){
                    return false;
                }
            }
            return true;
        }

        private boolean isLinear(int x1, int y1, int x2, int y2){
            return (y2-y1)/(x2-x1) == 1;
        }
}
