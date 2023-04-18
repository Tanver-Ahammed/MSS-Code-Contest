package com.tanver.Competitive.leetcode.problems;

public class P563_BinaryTreeTilt {

    int sum = 0;

    public int findTilt(TreeNode root) {
        helperPostOrder(root);
        return sum;
    }

    private int helperPostOrder(TreeNode root) {
        if (root == null)
            return 0;
        int left = helperPostOrder(root.left);
        int right = helperPostOrder(root.right);
        sum += Math.abs(left - right);
        return left + right + root.val;
    }

}
