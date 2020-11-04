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

    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }

        int numOfIslands = 0;
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                if(grid[row][col] == '0'){
                    continue;
                }
                numOfIslands += explore(row, col, grid);
            }
        }
        return numOfIslands;
    }

    public int explore(int row, int col, char[][] grid){
        if(row < 0 || row > grid.length - 1 || col < 0 || col > grid[0].length - 1 || grid[row][col] == '0'){
            return 0;
        }
        grid[row][col] = '0';
        explore(row + 1, col, grid);
        explore(row, col + 1, grid);
        explore(row - 1, col, grid);
        explore(row, col - 1, grid);
        return 1;
    }
}
