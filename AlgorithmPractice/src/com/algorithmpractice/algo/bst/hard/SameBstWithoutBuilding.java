package com.algorithmpractice.algo.bst.hard;

import java.util.ArrayList;
import java.util.List;

class SameBstWithoutBuildingTree {

    public static boolean sameBsts(List<Integer> arrayOne, List<Integer> arrayTwo) {
        if(arrayOne.size() != arrayTwo.size()){
            return false;
        }
        if(arrayOne.size() == 0 && arrayTwo.size() == 0){
            return true;
        }
        if(arrayOne.get(0) != arrayTwo.get(0)){
            return false;
        }

        List<Integer> smallerOne = new ArrayList<>();
        List<Integer> greaterOne = new ArrayList<>();
        List<Integer> smallerTwo = new ArrayList<>();
        List<Integer> greaterTwo = new ArrayList<>();

        for(int i = 0; i < arrayOne.size(); i++){
            if(arrayOne.get(i) < arrayOne.get(0)){
                smallerOne.add(arrayOne.get(i));
            }else{
                greaterOne.add(arrayOne.get(i));
            }

            if(arrayTwo.get(i) < arrayTwo.get(0)){
                smallerTwo.add(arrayTwo.get(i));
            }else{
                greaterTwo.add(arrayTwo.get(i));
            }
        }

      return sameBsts(smallerOne, smallerTwo);
    }
}
