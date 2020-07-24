package com.algorithmpractice.algo.medium;

public class MonotonicArray {
    //Array is monotonic when it is always increasing or always decreasing.
    //O(n) time / O(1) space
    public boolean isMonotonic(int[] array) {
        if(array.length <= 2)
            return true;

        int direction = array[1]-array[0];

        for(int i=0, j=1; j<array.length; i++, j++){
            if(direction==0){
                direction=array[j]-array[i];
                continue;
            }
            if(directionChange(direction,array[i],array[j])){
                return false;
            }
        }

        return true;
    }

    private boolean directionChange(int direction, int i, int j){
        if(direction>0)
            return j-i<0;
        return j-i>0;
    }
}
