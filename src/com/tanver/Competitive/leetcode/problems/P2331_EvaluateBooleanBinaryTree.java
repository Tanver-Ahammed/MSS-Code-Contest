package com.tanver.Competitive.leetcode.problems;

public class P2331_EvaluateBooleanBinaryTree {

    public boolean evaluateTree(TreeNode root) {
        if (root.val == 0)
            return false;
        if (root.val == 1)
            return true;
        boolean left = evaluateTree(root.left);
        boolean right = evaluateTree(root.right);
        return root.val == 2 ? left | right : left & right;
    }

}
