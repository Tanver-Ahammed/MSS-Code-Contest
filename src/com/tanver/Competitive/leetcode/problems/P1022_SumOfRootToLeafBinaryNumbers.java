package com.tanver.Competitive.leetcode.problems;

public class P1022_SumOfRootToLeafBinaryNumbers {

    public int sumRootToLeaf(TreeNode root) {
        return sumRootToLeaf(root, 0);
    }

    public int sumRootToLeaf(TreeNode root, int sum) {
        if (root == null)
            return 0;
        sum = (2 * sum) + root.val;
        if (root.left == null && root.right == null)
            return sum;
        return sumRootToLeaf(root.left, sum) + sumRootToLeaf(root.right, sum);
    }

}
