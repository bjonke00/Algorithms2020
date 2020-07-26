package com.algorithmpractice.algo.medium;

import java.util.List;

public class MinHeightBst {
    public static BST minHeightBst(List<Integer> array) {
        return getMinHeightBst(array, null, 0, array.size()-1);
    }

    public static BST getMinHeightBst(List<Integer> array, BST bst, int start, int end){
        if(end<start)
            return null;
        int midpoint = (end+start)/2;
        if(bst==null){
            bst = new BST(array.get(midpoint));
        }else{
            bst.insert(array.get(midpoint));
        }
        //left half
        getMinHeightBst(array, bst, start, midpoint-1);
        //right half
        getMinHeightBst(array, bst, midpoint+1, end);
        return bst;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public void insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    left = new BST(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new BST(value);
                } else {
                    right.insert(value);
                }
            }
        }
    }
}
