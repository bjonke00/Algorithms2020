package com.algorithmpractice.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.algorithmpractice.leetcode.PathSum.TreeNode;

public class PathSumTest {

//	      5
//	     / \
//	    4   8
//	   /   / \
//	  11  13  4
//	 /  \      \
//	7    2      1

	private PathSum pathSum = new PathSum();
	
	@Test
	public void test() {
		
		TreeNode node1 = pathSum.createTreeNode(4);
		TreeNode node2 = pathSum.createTreeNode(8);
		TreeNode node3 = pathSum.createTreeNode(11);
		TreeNode node4 = pathSum.createTreeNode(13);
		TreeNode node5 = pathSum.createTreeNode(4);
		TreeNode node6 = pathSum.createTreeNode(7);
		TreeNode node7 = pathSum.createTreeNode(2);
		TreeNode node8 = pathSum.createTreeNode(1);
		TreeNode root = pathSum.createTreeNode(5, node1, node2);
		node1 = pathSum.createTreeNode(4, node3, null);
		node2 = pathSum.createTreeNode(8, node4, node5);
		node3 = pathSum.createTreeNode(11, node6, node7);
		node5 = pathSum.createTreeNode(4, null, node8);

		assertEquals(true, pathSum.hasPathSum(root, 22));
	}

}
