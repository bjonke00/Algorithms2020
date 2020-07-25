package com.algorithmpractice.algo.medium;

import java.util.List;

public class TraverseBST {
    // O(n) time | O(n) space
    public List<Integer> inOrderTraverse(BST tree, List<Integer> array) {
        if(tree.left != null){
            inOrderTraverse(tree.left, array);
        }
        array.add(tree.value);
        if(tree.right != null){
            inOrderTraverse(tree.right, array);
        }
        return array;
    }

    // O(n) time | O(n) space
    public List<Integer> preOrderTraverse(BST tree, List<Integer> array) {
        array.add(tree.value);
        if(tree.left != null){
            preOrderTraverse(tree.left, array);
        }
        if(tree.right != null){
            preOrderTraverse(tree.right, array);
        }
        return array;
    }

    // O(n) time | O(n) space
    public List<Integer> postOrderTraverse(BST tree, List<Integer> array) {
        if(tree.left != null){
            postOrderTraverse(tree.left, array);
        }
        if(tree.right != null){
            postOrderTraverse(tree.right, array);
        }
        array.add(tree.value);
        return array;
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
