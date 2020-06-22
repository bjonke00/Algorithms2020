package com.algorithmpractice.leetcode;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class CountTreeNodesTest {

//    Input:
//            1
//           / \
//          2   3
//         / \ /
//        4  5 6
//
//    Output: 6
    private CountTreeNodes countTreeNodes;

    @Before
    public void setup(){
        countTreeNodes = new CountTreeNodes();
    }

    @Test
    public void test1(){
        CountTreeNodes.TreeNode treeNode4 = new CountTreeNodes.TreeNode(4);
        CountTreeNodes.TreeNode treeNode5 = new CountTreeNodes.TreeNode(5);
        CountTreeNodes.TreeNode treeNode2 = new CountTreeNodes.TreeNode(2, treeNode4, treeNode5);
        CountTreeNodes.TreeNode treeNode6 = new CountTreeNodes.TreeNode(6);
        CountTreeNodes.TreeNode treeNode3 = new CountTreeNodes.TreeNode(3, treeNode6, null);
        CountTreeNodes.TreeNode treeNode1 = new CountTreeNodes.TreeNode(1, treeNode2, treeNode3);

        int nodes = countTreeNodes.countNodes(treeNode1);
        assertEquals(6, nodes);
    }

}