package com.algorithmpractice.algo.binarytree.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NodeDepthsTest {

    private NodeDepths nodeDepths;

    @Before
    public void setup(){
        nodeDepths = new NodeDepths();
    }

    @Test
    public void TestCase1() {
        NodeDepths.BinaryTree root = new NodeDepths.BinaryTree(1);
        root.left = new NodeDepths.BinaryTree(2);
        root.left.left = new NodeDepths.BinaryTree(4);
        root.left.left.left = new NodeDepths.BinaryTree(8);
        root.left.left.right = new NodeDepths.BinaryTree(9);
        root.left.right = new NodeDepths.BinaryTree(5);
        root.right = new NodeDepths.BinaryTree(3);
        root.right.left = new NodeDepths.BinaryTree(6);
        root.right.right = new NodeDepths.BinaryTree(7);
        int actual1 = NodeDepths.nodeDepths(root);
        int actual2 = NodeDepths.nodeDepthsLevels(root);
        int actual3 = NodeDepths.nodeDepthsRecursive(root);
        assertEquals(16, actual1);
        assertEquals(16, actual2);
        assertEquals(16, actual3);

    }

}