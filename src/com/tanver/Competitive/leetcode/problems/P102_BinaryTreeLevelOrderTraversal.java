package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;
        Queue<TreeNode> Q = new LinkedList<>();
        Q.offer(root);
        while (!Q.isEmpty()) {
            int n = Q.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode current = Q.poll();
                assert current != null;
                temp.add(current.val);
                if (current.left != null)
                    Q.offer(current.left);
                if (current.right != null)
                    Q.offer(current.right);
            }
            result.add(temp);
        }
        return result;
    }

}
