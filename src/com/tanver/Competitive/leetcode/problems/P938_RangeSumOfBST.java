package com.tanver.Competitive.leetcode.problems;

public class P938_RangeSumOfBST {

    int sum = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null)
            return 0;
        rangeSumBST(root.left, L, R);
        if (L <= root.val && R >= root.val)
            sum += root.val;
        rangeSumBST(root.right, L, R);
        return sum;
    }

}
