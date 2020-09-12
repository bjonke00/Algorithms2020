package com.algorithmpractice.algo.binarytree.easy;

import java.util.LinkedList;
import java.util.Queue;

public class NodeDepths {

    //time O(n) : space O(D)
    public static int nodeDepths(BinaryTree root) {
        int totalDepth = 0;
        Queue<BinaryTree> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryTree node = queue.poll();
            int depth = node.depth;
            totalDepth += depth;
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
    public static int nodeDepthsLevels(BinaryTree root) {
        int totalDepth = 0;
        Queue<Level> queue = new LinkedList<>();
        queue.add(new Level(root, 0));
        while(!queue.isEmpty()){
            Level level = queue.poll();
            int depth = level.depth;
            totalDepth += depth;
            BinaryTree node = level.node;
            if(node.left != null){
                queue.add(new Level(node.left, depth + 1));
            }
            if(node.right != null){
                queue.add(new Level(node.right, depth + 1));
            }
        }
        return totalDepth;
    }

    static class Level{
        BinaryTree node;
        int depth;

        public Level(BinaryTree node, int depth){
            this.node = node;
            this.depth = depth;
        }
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


