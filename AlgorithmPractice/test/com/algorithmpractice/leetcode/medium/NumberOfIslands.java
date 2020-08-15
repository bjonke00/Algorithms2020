package com.algorithmpractice.leetcode.medium;

public class NumberOfIslands {
    public int getNumberOfIslands(char[][] grid) {
        int numberOfIslands = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == '1'){
                    numberOfIslands += traverseIsland(grid, i, j);
                }
            }
        }

        return numberOfIslands;
    }

    public int traverseIsland(char[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0'){
            return 0;
        }

        grid[i][j] = '0';
        traverseIsland(grid, i+1, j);
        traverseIsland(grid, i-1, j);
        traverseIsland(grid, i, j+1);
        traverseIsland(grid, i, j-1);

        return 1;
    }
}
