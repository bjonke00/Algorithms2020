package com.algorithmpractice.algo.medium;

/*Dynamic Programming :
  Return the minimum edits (substitute, replace, delete) to transform string1 into string2*/
public class LevenshteinDistance {
    //time O(nm) space O(nm)
    public int getLevenshteinDistance(String str1, String str2) {
        //create grid one size larger
        int[][] editsGrid = new int[str1.length() + 1][str2.length() + 1];
        //fill in first row with 0 to str1.length()
        for (int row = 0; row < str1.length() + 1; row++) {
            editsGrid[row][0] = row;
        }
        //fill in first col with 0 to str2.length()
        for (int col = 0; col < str2.length() + 1; col++) {
            editsGrid[0][col] = col;
        }
        //update the values on the grid
        for (int row = 1; row < str1.length() + 1; row++) {
            for (int col = 1; col < str2.length() + 1; col++) {
                //if chars are equal take diagonal value
                if (str1.charAt(row - 1) == str2.charAt(col - 1)) {
                    editsGrid[row][col] = editsGrid[row - 1][col - 1];
                } else {
                    //else take min upper, right, diagonal + 1
                    int smaller = Math.min(editsGrid[row - 1][col], editsGrid[row][col - 1]);
                    editsGrid[row][col] = 1 + Math.min(smaller, editsGrid[row - 1][col - 1]);
                }
            }
        }
        return editsGrid[str1.length()][str2.length()];
    }
}
