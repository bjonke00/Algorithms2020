package com.algorithmpractice.algo.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
    //time O(n) & space O(n)
    public List<Integer> spiralTraverse(int[][] array) {
        List<Integer> answer = new ArrayList<>();
        int startRow = 0, endRow = array.length - 1;
        int startColumn = 0, endColumn = array[0].length - 1;

        while (startRow <= endRow && startColumn <= endColumn) {
            for (int column = startColumn; column <= endColumn; column++) {
                answer.add(array[startRow][column]);
            }
            for (int row = startRow + 1; row <= endRow; row++) {
                answer.add(array[row][endColumn]);
            }
            for (int column = endColumn - 1; column >= startColumn; column--) {
                if (startRow == endRow)
                    return answer;
                answer.add(array[endRow][column]);
            }
            for (int row = endRow - 1; row > startRow; row--) {
                if (startColumn == endColumn)
                    return answer;
                answer.add(array[row][startColumn]);
            }
            startRow++;
            endColumn--;
            endRow--;
            startColumn++;
        }
        return answer;
    }
}
