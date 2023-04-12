package com.tanver.Competitive.leetcode.problems;

public class P101_SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))
            return true;
        if (root.left == null || root.right == null)
            return false;
        return isSameTree(root.left, root.right);
    }

    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        return p.val == q.val && isSameTree(p.left, q.right)
                && isSameTree(p.right, q.left);
    }

}
