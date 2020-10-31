package com.algorithmpractice.leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        Queue<Orange> rottenOrangeQueue = new LinkedList<>();
        int fresh = populateRottenAndFresh(grid, 0, rottenOrangeQueue);
        int minutes = -1;
        int directions[][] = {{0,1},{1,0},{0,-1},{-1,0}};

        while(!rottenOrangeQueue.isEmpty()){
            Orange currentRotten = rottenOrangeQueue.poll();
            if(isLevelComplete(currentRotten)){
                minutes++;
                if(!rottenOrangeQueue.isEmpty()){
                    rottenLevelComplete(rottenOrangeQueue);
                }
            }else{
                fresh = checkRottenNeighbors(grid, rottenOrangeQueue, fresh, directions, currentRotten);
            }
        }

        return fresh == 0 ? minutes : -1;
    }

    private int checkRottenNeighbors(int[][] grid, Queue<Orange> rottenOrangeQueue, int fresh, int[][] directions, Orange currentRotten) {
        for(int[] direction : directions){
            int row = currentRotten.x + direction[0];
            int col = currentRotten.y + direction[1];
            if(isOutOfBounds(grid, row, col)){
                continue;
            }
            if(grid[row][col] == 1){
                fresh--;
                grid[row][col] = 2;
                rottenOrangeQueue.add(new Orange(row,col));
            }
        }
        return fresh;
    }

    private boolean isOutOfBounds(int[][] grid, int row, int col) {
        return row < 0 || row >= grid.length || col < 0 || col >= grid[row].length;
    }

    private boolean isLevelComplete(Orange currentRotten) {
        return currentRotten.x == -1;
    }

    private void rottenLevelComplete(Queue<Orange> rottenOrangeQueue) {
        rottenOrangeQueue.offer(new Orange(-1,-1));
    }

    private int populateRottenAndFresh(int[][] grid, int fresh, Queue<Orange> queue) {
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    fresh++;
                }else if(grid[i][j] == 2){
                    queue.offer(new Orange(i,j));
                }
            }
        }
        rottenLevelComplete(queue);
        return fresh;
    }

    public static class Orange {
        int x;
        int y;
        public Orange(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
