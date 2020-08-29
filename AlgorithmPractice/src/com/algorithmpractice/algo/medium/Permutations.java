package com.algorithmpractice.algo.medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    //time O(n*n!) space O(n*n!)
    public List<List<Integer>> getPermutations(List<Integer> array){
        List<List<Integer>> permutations = new ArrayList<>();
        getPermutations(array, new ArrayList<Integer>(), permutations);
        return permutations;
    }

    private void getPermutations(List<Integer> array, List<Integer> currentPermutation, List<List<Integer>> permutations) {
        if(array.isEmpty() && currentPermutation.size() > 0) {
            permutations.add(currentPermutation);
        }else{
            for(int i = 0; i < array.size(); i++){
                List<Integer> newArray = new ArrayList<>(array);
                newArray.remove(i);
                List<Integer> newPermutation = new ArrayList<Integer>(currentPermutation);
                newPermutation.add(array.get(i));
                getPermutations(newArray, newPermutation, permutations);
            }
        }
    }

    public  List<List<Integer>> getPermutations1(List<Integer> array){
        List<List<Integer>> permutations = new ArrayList<>();
        getPermutations(0, array, permutations);
        return permutations;
    }

    private void getPermutations(int i, List<Integer> array, List<List<Integer>> permutations) {
        if(i == array.size() - 1) {
            permutations.add(new ArrayList<Integer>(array));
        }else{
            for(int j = i; j < array.size(); j++){
                swap(array, i, j);
                getPermutations(i+1, array, permutations);
                swap(array, i, j);
            }
        }
    }

    private void swap(List<Integer> array, int i, int j){
        Integer tmp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, tmp);
    }
}
