package com.algorithmpractice.algo.dynamic.extreme;

public class GlobMatching {
    //time & space O(n*m)
    public static boolean globMatching(String fileName, String pattern) {
        boolean[][] matchMatrix = new boolean[fileName.length() + 1][pattern.length() + 1];
        initializeMatrix(matchMatrix, pattern);
        for(int row = 1; row < matchMatrix.length; row++){
            for(int col = 1; col < matchMatrix[0].length; col++){
                char fileNameChar = fileName.charAt(row - 1);
                char patternChar = pattern.charAt(col - 1);
                if(patternChar == '*'){
                    matchMatrix[row][col] = matchMatrix[row][col - 1] || matchMatrix[row - 1][col];
                }else if(patternChar == '?' || patternChar == fileNameChar){
                    matchMatrix[row][col] = matchMatrix[row - 1][col - 1];
                }
            }
        }
        return matchMatrix[matchMatrix.length - 1][matchMatrix[0].length - 1];
    }

    public static void initializeMatrix(boolean[][] matchMatrix, String pattern){
        matchMatrix[0][0] = true;
        for(int col = 1; col < matchMatrix[0].length; col++){
            if(pattern.charAt(col - 1) == '*'){
                matchMatrix[0][col] = matchMatrix[0][col - 1];
            }
        }
    }
}
