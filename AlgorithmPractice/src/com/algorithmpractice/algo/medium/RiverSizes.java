package com.algorithmpractice.algo.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*Given 2d array 0 represents land and 1 represents water.
* A river represents horizontally or vertically adjacent 1's.
* Return an array of all the river sizes.*/
public class RiverSizes {
        //time O(nm) | space(nm)
        public static List<Integer> riverSizes(int[][] matrix) {
            List<Integer> sizes = new ArrayList<>();
            boolean[][] visited = new boolean[matrix.length][matrix[0].length];

            for(int r=0; r<matrix.length; r++){
                for(int c=0; c<matrix[r].length; c++){
                    if(!visited[r][c]){
                        getRiverSize(matrix, sizes, visited, r, c);
                    }
                }
            }

            return sizes;
        }

        //dfs implementation
        private static void getRiverSize(int[][] matrix, List<Integer> sizes, boolean[][]visited, int r, int c){
            int size = 0;
            Stack<Integer[]> nodes = new Stack<>();
            nodes.push(new Integer[]{r,c});
            while(!nodes.isEmpty()){
                Integer[] node = nodes.pop();
                r = node[0];
                c = node[1];
                if(visited[r][c]){
                    continue;
                }
                visited[r][c]=true;
                if(matrix[r][c] == 0){
                    continue;
                }
                size++;
                List<Integer[]> unvisitedNeighbors = getUnvisitedNeighbors(matrix, visited, r, c);
                for(Integer[] u : unvisitedNeighbors){
                    nodes.push(u);
                }
            }
            if(size>0){
                sizes.add(size);
            }
        }

        private static List<Integer[]> getUnvisitedNeighbors(int[][] matrix, boolean[][]visited, int r, int c){
            List<Integer[]> unvisitedNeighbors = new ArrayList();
            if(r>0 && !visited[r-1][c]){
                unvisitedNeighbors.add(new Integer[]{r-1,c});
            }
            if(r<matrix.length-1 && !visited[r+1][c]){
                unvisitedNeighbors.add(new Integer[]{r+1,c});
            }
            if(c>0 && !visited[r][c-1]){
                unvisitedNeighbors.add(new Integer[]{r,c-1});
            }
            if(c<matrix[0].length-1 && !visited[r][c+1]){
                unvisitedNeighbors.add(new Integer[]{r,c+1});
            }

            return unvisitedNeighbors;
        }

}
