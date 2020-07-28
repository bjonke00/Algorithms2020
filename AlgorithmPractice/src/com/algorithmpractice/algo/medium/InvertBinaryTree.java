package com.algorithmpractice.algo.medium;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {
    //time O(n) / space O(d)
    public void invertBinaryTree(BinaryTree tree) {
        if(tree == null){
            return;
        }
        swap(tree);
        invertBinaryTree(tree.left);
        invertBinaryTree(tree.right);
    }

    //time O(n) / space O(n)
    public static void invertBinaryTree1(BinaryTree tree) {
        Queue<BinaryTree> queue = new LinkedList();
        queue.add(tree);
        while(!queue.isEmpty()){
            BinaryTree current = queue.poll();
            swap(current);
            if(current.left != null){
                queue.add(current.left);
            }
            if(current.right != null){
                queue.add(current.right);
            }
        }
    }

    private static void swap(BinaryTree tree){
        BinaryTree left = tree.left;
        tree.left = tree.right;
        tree.right = left;
    }

    public static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

}
