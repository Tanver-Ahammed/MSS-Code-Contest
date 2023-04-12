package com.tanver.Competitive.leetcode.problems;

public class P110_BalancedBinaryTree {

    public boolean isBalanced1(TreeNode root) {
        if (root == null)
            return true;
        if (Math.abs(height1(root.left) - height1(root.right)) > 1)
            return false;
        return isBalanced1(root.left) && isBalanced1(root.right);
    }

    private int height1(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(height1(root.left), height1(root.right));
    }


    public boolean isBalanced2(TreeNode root) {
        if (root == null)
            return true;
        return height2(root) != -1;
    }

    private int height2(TreeNode root) {
        if (root == null)
            return 0;
        int left = height2(root.left);
        int right = height2(root.right);
        int bf = Math.abs(left - right);

        if (bf > 1 || left == -1 || right == -1)
            return -1;
        return 1 + Math.max(left, right);
    }

}
