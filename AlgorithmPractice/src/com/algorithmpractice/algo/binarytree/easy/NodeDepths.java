package com.algorithmpractice.algo.binarytree.easy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NodeDepths {

    //time O(n) : space O(D)
    public static int nodeDepths(BinaryTree root) {
        int totalDepth = 0;
        Queue<BinaryTree> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryTree node = queue.poll();
            int depth = node.depth;
            totalDepth += node.depth;
            if(node.left != null){
                node.left.depth = depth + 1;
                queue.add(node.left);
            }
            if(node.right != null){
                node.right.depth = depth + 1;
                queue.add(node.right);
            }
        }
        return totalDepth;
    }

    //time O(n) : space O(D)
    public static int nodeDepthsStack(BinaryTree root) {
        Stack<BinaryTree> stack = new Stack<>();
        root.depth = 0;
        stack.push(root);
        int sumOfDepths = 0;
        while(!stack.isEmpty()){
            BinaryTree tree = stack.pop();
            sumOfDepths += tree.depth;
            if(tree.left != null){
                tree.left.depth = tree.depth + 1;
                stack.push(tree.left);
            }
            if(tree.right != null){
                tree.right.depth = tree.depth + 1;
                stack.push(tree.right);
            }
        }
        return sumOfDepths;
    }

    //time O(n) : space O(D)
    public static int nodeDepthsRecursive(BinaryTree root) {
        return nodeDepthsHelper(root, 0);
    }

    public static int nodeDepthsHelper(BinaryTree root, int depth){
        //find depth of ea. node
        if(root == null) return 0;
        return depth + nodeDepthsHelper(root.left, depth+1) + nodeDepthsHelper(root.right, depth+1);
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;
        int depth = 0;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}


