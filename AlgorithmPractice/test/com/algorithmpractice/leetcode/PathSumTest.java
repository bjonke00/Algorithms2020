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
		
		TreeNode node4 = pathSum.createTreeNode(4);
		TreeNode node8 = pathSum.createTreeNode(8);
		TreeNode node11 = pathSum.createTreeNode(11);
		TreeNode node13 = pathSum.createTreeNode(13);
		TreeNode node41 = pathSum.createTreeNode(4);
		TreeNode node7 = pathSum.createTreeNode(7);
		TreeNode node2 = pathSum.createTreeNode(2);
		TreeNode node1 = pathSum.createTreeNode(1);

		TreeNode left2 = pathSum.createTreeNode(11, node7, node2);
		TreeNode right2 = pathSum.createTreeNode(4, null, node1);
		TreeNode left1 = pathSum.createTreeNode(4, left2, null);
		TreeNode right1 = pathSum.createTreeNode(8, node13, right2);
		TreeNode root = pathSum.createTreeNode(5, left1, right1);

		assertEquals(true, pathSum.hasPathSum(root, 22));
	}

}
