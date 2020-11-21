package com.algorithmpractice.other;

public class NumberOfPaths {

    static int numOfPathsToDest(int n) {
        return dfs(0, 0, n);
    }

    static int dfs(int i, int j, int n){
        if( i >= n || j >= n || i < j){
            return 0;
        }

        if(i == n - 1 && j == n - 1){
            return 1;
        }

        return dfs(i + 1, j, n) + dfs(i, j + 1, n);
    }

}
