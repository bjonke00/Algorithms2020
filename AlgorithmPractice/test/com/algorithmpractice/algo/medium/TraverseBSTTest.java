package com.algorithmpractice.algo.medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TraverseBSTTest {
        @Test
        public void TestCase1() {
            TraverseBST t = new TraverseBST();
            TraverseBST.BST root = new TraverseBST.BST(10);
            root.left = new TraverseBST.BST(5);
            root.left.left = new TraverseBST.BST(2);
            root.left.left.left = new TraverseBST.BST(1);
            root.left.right = new TraverseBST.BST(5);
            root.right = new TraverseBST.BST(15);
            root.right.right = new TraverseBST.BST(22);

            List<Integer> inOrder = Arrays.asList(new Integer[]{1, 2, 5, 5, 10, 15, 22});
            List<Integer> preOrder = Arrays.asList(new Integer[]{10, 5, 2, 1, 5, 15, 22});
            List<Integer> postOrder = Arrays.asList(new Integer[]{1, 2, 5, 5, 22, 15, 10});

            assertTrue(t.inOrderTraverse(root, new ArrayList<Integer>()).equals(inOrder));
            assertTrue(t.preOrderTraverse(root, new ArrayList<Integer>()).equals(preOrder));
            assertTrue(t.postOrderTraverse(root, new ArrayList<Integer>()).equals(postOrder));
        }
}