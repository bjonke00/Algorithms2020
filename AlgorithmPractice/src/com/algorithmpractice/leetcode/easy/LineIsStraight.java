package com.algorithmpractice.leetcode.easy;

public class LineIsStraight {
    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0], x2 = coordinates[1][0];
        int y1 = coordinates[0][1], y2 = coordinates[1][1];
        int x = x2-x1;
        int y = y2-y1;

        for (int i = 2; i < coordinates.length; i++) {
            int currentX = coordinates[i][0] - coordinates[i-1][0];
            int currentY = coordinates[i][1] - coordinates[i-1][1];
            if(y*currentX != x*currentY)
                return false;
        }

        return true;
    }
}
