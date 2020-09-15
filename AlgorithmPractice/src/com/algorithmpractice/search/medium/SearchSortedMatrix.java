package com.algorithmpractice.search.medium;

public class SearchSortedMatrix {
    //start from upper-right (can also start from lower-left corner)
    //eliminating all the numbers greater than target (everything to the right) by moving left
    //eliminating all the numbers less than target (everything to the left) by moving down
    //time O(n+m) | space O(1)
    public static int[] searchInSortedMatrix(int[][] matrix, int target) {
        int row = matrix.length - 1, col = 0;
        while (row >= 0 && col < matrix[row].length) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }
            if (matrix[row][col] < target) {
                col++;
            } else {
                row--;
            }
        }
        return new int[]{-1, -1};
    }
}
