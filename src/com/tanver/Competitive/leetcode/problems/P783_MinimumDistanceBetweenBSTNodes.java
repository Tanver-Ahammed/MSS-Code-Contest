package com.tanver.Competitive.leetcode.problems;

public class P783_MinimumDistanceBetweenBSTNodes {

    TreeNode prev;

    int min = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        if (root != null) {
            minDiffInBST(root.left);
            if (prev != null)
                min = Math.min(root.val - prev.val, min);
            prev = root;
            minDiffInBST(root.right);
        }
        return min;
    }

}
