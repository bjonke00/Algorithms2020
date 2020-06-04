package com.algorithmpractice.leetcode;

public class PathSum {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		public TreeNode() {
		}

		public TreeNode(int val) {
			this.val = val;
		}

		public TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
		
	}

	public TreeNode createTreeNode(int val) {
		return new TreeNode(val);
	}
	
	public TreeNode createTreeNode(int val, TreeNode left, TreeNode right) {
		return new TreeNode(val, left, right);
	}
	
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null)
			return false;

		if (root.val == sum && root.left == null && root.right == null)
			return true;

		return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);

	}

}