package com.algorithmpractice.algo.binarytree.extreme;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindAllNodeDepthsTest {
    @Test
    public void TestCase1() {
        FindAllNodeDepths.BinaryTree root = new FindAllNodeDepths.BinaryTree(1);
        root.left = new FindAllNodeDepths.BinaryTree(2);
        root.left.left = new FindAllNodeDepths.BinaryTree(4);
        root.left.left.left = new FindAllNodeDepths.BinaryTree(8);
        root.left.left.right = new FindAllNodeDepths.BinaryTree(9);
        root.left.right = new FindAllNodeDepths.BinaryTree(5);
        root.right = new FindAllNodeDepths.BinaryTree(3);
        root.right.left = new FindAllNodeDepths.BinaryTree(6);
        root.right.right = new FindAllNodeDepths.BinaryTree(7);
        int actual = FindAllNodeDepths.allKindsOfNodeDepths(root);
        assertEquals(26, actual);
        int actual1 = FindAllNodeDepths.allKindsOfNodeDepths1(root);
        assertEquals(26, actual1);

    }
}