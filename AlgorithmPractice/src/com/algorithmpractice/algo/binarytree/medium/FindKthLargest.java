package com.algorithmpractice.algo.binarytree.medium;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import static org.junit.Assert.assertTrue;

public class FindKthLargest {

    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    List<Integer> sortedList = new ArrayList<>();

    public int findKthLargestValueInBst(BST tree, int k) {
        populateListInOrder(tree);
        return sortedList.get(sortedList.size() - k);
    }

    public void populateListInOrder(BST bst){
        if(bst == null){
            return;
        }
        populateListInOrder(bst.left);
        sortedList.add(bst.value);
        populateListInOrder(bst.right);
    }

    FindKthLargest.BST root;
    @Before
    public void setUp(){
        root = new FindKthLargest.BST(15);
        root.left = new FindKthLargest.BST(5);
        root.left.left = new FindKthLargest.BST(2);
        root.left.left.left = new FindKthLargest.BST(1);
        root.left.left.right = new FindKthLargest.BST(3);
        root.left.right = new FindKthLargest.BST(5);
        root.right = new FindKthLargest.BST(20);
        root.right.left = new FindKthLargest.BST(17);
        root.right.right = new FindKthLargest.BST(22);
    }

    @Test
    public void testFindKthLargestInBST() {
        int k = 3;
        var expected = 17;
        var actual = new FindKthLargest().findKthLargestValueInBst(root, k);
        assertTrue(expected == actual);
    }

    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

    public int findKthLargestValueInTree(BST tree, int k) {
        populatePq(tree);
        return sortedList.get(sortedList.size() - k);
    }

    public void populatePq(BST bst){
        if(bst == null){
            return;
        }
        populateListInOrder(bst.left);
        pq.offer(bst.value);
        populateListInOrder(bst.right);
    }

    @Test
    public void testFindKthLargestInTree() {
        int k = 3;
        var expected = 17;
        var actual = new FindKthLargest().findKthLargestValueInTree(root, k);
        assertTrue(expected == actual);
    }


}
