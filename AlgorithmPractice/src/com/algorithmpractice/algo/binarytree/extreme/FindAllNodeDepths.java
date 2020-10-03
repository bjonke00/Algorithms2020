package com.algorithmpractice.algo.binarytree.extreme;

import java.util.*;

public class FindAllNodeDepths {

    //time O(nlog(n)) & space O(h)
    public static int allKindsOfNodeDepths(BinaryTree root) {
        Stack<BinaryTree> stack = new Stack<BinaryTree>();
        int sumOfNodeDepths = 0;
        stack.push(root);
        while(!stack.isEmpty()){
            BinaryTree node = stack.pop();
            if(node == null) continue;
            sumOfNodeDepths += getNodeDepths(node, 0);
            stack.push(node.left);
            stack.push(node.right);
        }
        return sumOfNodeDepths;
    }

    public static int getNodeDepths(BinaryTree node, int depth) {
        if (node == null) return 0;
        return depth + getNodeDepths(node.left, depth + 1) + getNodeDepths(node.right, depth + 1);
    }

    public static int allKindsOfNodeDepths1(BinaryTree root) {
        // bfs -> findNodeDepths -> setSumOfNodeDepths for each node -> getTotalSumOfNodeDepths/dfs
        breadthFirstSearchTree(root);
        List<Integer> totalSumOfNodeDepths = getTotalSumOfNodeDepths(root, new ArrayList<Integer>());
        return totalSumOfNodeDepths.stream().reduce(0, Integer::sum);
    }

    public static void breadthFirstSearchTree(BinaryTree root){
        Queue<BinaryTree> queue = new ArrayDeque<>();
        root.depth = 0;
        queue.add(root);
        int sumOfNodeDepths = 0;
        while(!queue.isEmpty()){
            BinaryTree tree = queue.poll();
            sumOfNodeDepths += tree.depth;
            if(tree.left != null) {
                tree.left.depth = tree.depth + 1;
                queue.add(tree.left);
            }
            if(tree.right != null){
                tree.right.depth = tree.depth + 1;
                queue.add(tree.right);
            }
        }
        root.sumOfNodeDepths = sumOfNodeDepths;
        if(root.left != null) breadthFirstSearchTree(root.left);
        if(root.right != null) breadthFirstSearchTree(root.right);
    }

    public static List<Integer> getTotalSumOfNodeDepths(BinaryTree root, List<Integer> totalSumOfNodeDepths){
        totalSumOfNodeDepths.add(root.sumOfNodeDepths);
        if(root.left != null) getTotalSumOfNodeDepths(root.left, totalSumOfNodeDepths);
        if(root.right != null) getTotalSumOfNodeDepths(root.right, totalSumOfNodeDepths);
        return totalSumOfNodeDepths;
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;
        int depth;
        int sumOfNodeDepths;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
