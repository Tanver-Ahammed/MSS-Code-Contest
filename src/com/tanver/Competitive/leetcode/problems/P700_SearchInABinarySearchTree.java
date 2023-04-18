package com.tanver.Competitive.leetcode.problems;

public class P700_SearchInABinarySearchTree {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val)
            return root;
        else
            return val < root.val ? searchBST(root.left, val) : searchBST(root.right, val);
    }

}
