package com.tanver.Competitive.leetcode.problems;

public class P897_IncreasingOrderSearchTree {

    public TreeNode increasingBST(TreeNode root) {
        return helper(root, null);
    }

    public TreeNode helper(TreeNode root, TreeNode tail) {
        if (root == null)
            return tail;
        TreeNode res = helper(root.left, root);
        root.left = null;
        root.right = helper(root.right, tail);
        return res;
    }

}
