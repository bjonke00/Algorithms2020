package com.algorithmpractice.algo.binarytree.hard;

public class MaxPathSum {
    //time O(n) | space O(log(n))
    public int findMaxPathSum(BinaryTree tree){
        Result result = new Result(Integer.MIN_VALUE);
        findMaxPathSum(tree, result);
        return result.value;
    }

    private int findMaxPathSum(BinaryTree node, Result result){
        if(node == null) return 0;

        int leftBranchMaxPathSum = findMaxPathSum(node.left, result);
        int rightBranchMaxPathSum = findMaxPathSum(node.right, result);

        int maxBranchPathSum = Math.max(Math.max(leftBranchMaxPathSum, rightBranchMaxPathSum) + node.value, node.value);
        int maxRootPathSum = Math.max(maxBranchPathSum, leftBranchMaxPathSum + rightBranchMaxPathSum + node.value);
        result.value = Math.max(maxRootPathSum, result.value);

        return maxBranchPathSum;
    }

    private class Result{
        int value;
        public Result(int value){
            this.value = value;
        }
    }

    public static class BinaryTree{
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value){
            this.value = value;
        }
    }
}
