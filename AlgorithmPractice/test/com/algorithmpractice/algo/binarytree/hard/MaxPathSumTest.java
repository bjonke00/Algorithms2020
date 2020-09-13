package com.algorithmpractice.algo.binarytree.hard;

import org.junit.Test;

import java.util.ArrayDeque;

import static org.junit.Assert.*;

public class MaxPathSumTest {

    private MaxPathSum mps = new MaxPathSum();

    @Test
    public void TestCase1() {
        TestBinaryTree test = new TestBinaryTree(1);
        test.insert(new int[] {2, 3, 4, 5, 6, 7}, 0);
        assertTrue(mps.findMaxPathSum(test) == 18);
    }

    @Test
    public void TestCase2() {
        TestBinaryTree test = new TestBinaryTree(1);
        test.insert(new int[] {-1, 2}, 0);
        assertTrue(mps.findMaxPathSum(test) == 3);
    }

    @Test
    public void TestCase3() {
        TestBinaryTree test = new TestBinaryTree(1);
        test.insert(new int[] {-100, 99, 101, -1}, 0);
        assertTrue(mps.findMaxPathSum(test) == 101);
    }

    @Test
    public void TestCase4() {
        TestBinaryTree test = new TestBinaryTree(1);
        test.insert(new int[] {100, 2, -10, -1}, 0);
        assertTrue(mps.findMaxPathSum(test) == 103);
    }

    class TestBinaryTree extends MaxPathSum.BinaryTree {
        public TestBinaryTree(int value) {
            super(value);
        }

        public void insert(int[] values, int i) {
            if (i >= values.length) {
                return;
            }
            ArrayDeque<MaxPathSum.BinaryTree> queue = new ArrayDeque<MaxPathSum.BinaryTree>();
            queue.addLast(this);
            while (queue.size() > 0) {
                MaxPathSum.BinaryTree current = queue.pollFirst();
                if (current.left == null) {
                    current.left = new MaxPathSum.BinaryTree(values[i]);
                    break;
                }
                queue.addLast(current.left);
                if (current.right == null) {
                    current.right = new MaxPathSum.BinaryTree(values[i]);
                    break;
                }
                queue.addLast(current.right);
            }
            insert(values, i + 1);
        }
    }
}