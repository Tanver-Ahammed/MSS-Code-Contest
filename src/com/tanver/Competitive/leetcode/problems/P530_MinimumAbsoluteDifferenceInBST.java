package com.tanver.Competitive.leetcode.problems;

import java.util.Stack;
import java.util.TreeSet;

public class P530_MinimumAbsoluteDifferenceInBST {

    int minDiff = Integer.MAX_VALUE;
    TreeNode prev;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) return minDiff;
        getMinimumDifference(root.left);
        if (prev != null)
            minDiff = Math.min(minDiff, root.val - prev.val);
        prev = root;
        getMinimumDifference(root.right);
        return minDiff;
    }

    TreeSet<Integer> set = new TreeSet<>();
    int min = Integer.MAX_VALUE;

    public int getMinimumDifference1(TreeNode root) {
        if (root == null) return min;

        if (!set.isEmpty()) {
            if (set.floor(root.val) != null) {
                min = Math.min(min, root.val - set.floor(root.val));
            }
            if (set.ceiling(root.val) != null) {
                min = Math.min(min, set.ceiling(root.val) - root.val);
            }
        }
        set.add(root.val);
        getMinimumDifference(root.left);
        getMinimumDifference(root.right);
        return min;
    }

    public int getMinimumDifference2(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        TreeNode prev = null;
        int result = Integer.MAX_VALUE;
        while (curr != null || !st.isEmpty()) {
            if (curr != null) {
                st.push(curr);
                curr = curr.left;
            } else {
                curr = st.pop();
                if (prev != null)
                    result = Math.min(result, curr.val - prev.val);
                prev = curr;
                curr = curr.right;
            }
        }
        return result;
    }

}
