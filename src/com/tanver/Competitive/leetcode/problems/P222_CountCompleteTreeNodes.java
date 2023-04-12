package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class P222_CountCompleteTreeNodes {

    public int countNodes1(TreeNode root) {
        return result(root, new ArrayList<>()).size();
    }

    private List<Integer> result(TreeNode root, List<Integer> totalNode) {
        if (root != null) {
            result(root.left, totalNode);
            totalNode.add(root.val);
            result(root.right, totalNode);
        }
        return totalNode;
    }

    public int countNodes2(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        return countNodes2(root.left) + countNodes2(root.right) + 1;
    }

}
