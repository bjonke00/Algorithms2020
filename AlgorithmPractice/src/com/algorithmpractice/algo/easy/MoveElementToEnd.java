package com.algorithmpractice.algo.easy;

import java.util.ArrayList;
import java.util.List;

public class MoveElementToEnd {
    //move all instances of toMove to the end of the array
    //time:O(n), space:O(1)
    public List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        for(int i=0,j=array.size()-1; i<j;i++){
            while(i<j && array.get(j) == toMove)
                j--;
            if(array.get(i) == toMove)
                swap(i,j,array);
        }
        return array;
    }
    private void swap(int i, int j, List<Integer> array){
        int temp = array.get(j);
        array.set(j, array.get(i));
        array.set(i, temp);
    }

    //time/space O(n)
    public List<Integer> moveElementToEnd1(List<Integer> array, int toMove) {
        List<Integer> answer = new ArrayList<>(array.size());
        int toMoveCount = 0;
        for(int i : array){
            if(i!=toMove){
                answer.add(i);
            }else{
                toMoveCount++;
            }
        }
        while(toMoveCount>0){
            answer.add(toMove);
            toMoveCount--;
        }
        return answer;
    }
}
