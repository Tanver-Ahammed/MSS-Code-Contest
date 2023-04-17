package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class P102_BinaryTreeLevelOrderTraversal {

    private List<List<Integer>> result;

    private List<List<Integer>> levelOrder(TreeNode root) {
        result = new ArrayList<>();
        if (root == null)
            return result;
        traverse(root, 0);
        return result;
    }

    private void traverse(TreeNode root, int level) {
        if (root == null)
            return;
        if (result.size() == level)
            result.add(new ArrayList<>());
        result.get(level).add(root.val);
        traverse(root.left, level + 1);
        traverse(root.right, level + 1);
    }

}
