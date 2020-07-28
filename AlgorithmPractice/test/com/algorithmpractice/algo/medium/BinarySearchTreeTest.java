package com.algorithmpractice.algo.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    private BinarySearchTree bst;

    @Before
    public void setup(){
      bst = new BinarySearchTree();
    }

    @Test
    public void TestCase1() {
        BinarySearchTree.BST root = new BinarySearchTree.BST(10);
        root.left = new BinarySearchTree.BST(5);
        root.left.left = new BinarySearchTree.BST(2);
        root.left.left.left = new BinarySearchTree.BST(1);
        root.left.right = new BinarySearchTree.BST(5);
        root.right = new BinarySearchTree.BST(15);
        root.right.left = new BinarySearchTree.BST(13);
        root.right.left.right = new BinarySearchTree.BST(14);
        root.right.right = new BinarySearchTree.BST(22);

        root.insert(12);
        assertTrue(root.right.left.left.value == 12);

        root.remove(10);
        assertTrue(root.contains(10) == false);
        assertTrue(root.value == 12);

        assertTrue(root.contains(15));
    }
}