package com.tanver.Competitive.leetcode.problems;

public class P111_MinimumDepthOfBinaryTree {

    public int minDepth1(TreeNode root) {
        if (root == null)
            return 0;
        int left = minDepth1(root.left);
        int right = minDepth1(root.right);
        if (root.left == null || root.right == null)
            return 1 + left + right;
        else
            return 1 + Math.min(left, right);
    }

    public static void main(String[] args) {

    }

}
