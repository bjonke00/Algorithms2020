package com.algorithmpractice.algo.medium;

public class ValidateBST {
    public boolean validateBst(BST tree) {
        return validateBst(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean validateBst(BST tree, int min, int max) {
        if(tree.value<min || tree.value>=max){
            return false;
        }
        if(tree.left != null && !validateBst(tree.left, min, tree.value)){
            return false;
        }
        if(tree.right != null && !validateBst(tree.right, tree.value, max)){
            return false;
        }
        return true;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
