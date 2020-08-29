package com.algorithmpractice.algo.medium;

import java.util.ArrayList;
import java.util.List;

public class Powerset {
    //O(n*2^n) time/space
    public List<List<Integer>> powerset(List<Integer> array) {
        List<List<Integer>> subsets = new ArrayList<List<Integer>>();
        subsets.add(new ArrayList<Integer>());
        for(Integer i : array){
            int length = subsets.size();
            for(int j=0; j<length; j++){
                List<Integer> currentSet = new ArrayList<>(subsets.get(j));
                currentSet.add(i);
                subsets.add(currentSet);
            }
        }
        return subsets;
    }
}
