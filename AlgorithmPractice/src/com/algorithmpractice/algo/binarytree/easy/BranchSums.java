package com.algorithmpractice.algo.binarytree.easy;

import java.util.ArrayList;
import java.util.List;

public class BranchSums {

    //average : time = O(log(n) / space = O(log(n))
    //worst : time = O(n) / space = O(n)
    public static List<Integer> getBranchSums(BinaryTree root) {
        List<Integer> sums = new ArrayList<>();
        getBranchSums(root, 0, sums);
        return sums;
    }

    public static void getBranchSums(BinaryTree node, int sum, List<Integer> sums){
        if(node == null)
            return;

        if(node.left == null && node.right == null){
            sums.add(sum + node.value);
            return;
        }

        getBranchSums(node.left, sum + node.value, sums);
        getBranchSums(node.right, sum + node.value, sums);
    }

    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
}
