package com.algorithmpractice.algo;

import java.util.List;

public class ValidSubsequence {
    //O(n) time
    //O(1) space
    public boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int p1=0, p2=0;
        while(p1 < sequence.size() && p2 < array.size()){
            if(sequence.get(p1) == array.get(p2)){
                p1++;
            }
            p2++;
        }
        return p1 == sequence.size();
    }
}
