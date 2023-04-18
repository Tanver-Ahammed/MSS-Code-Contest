package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P107_BinaryTreeLevelOrderTraversalII {

    private List<List<Integer>> result;

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        result = new ArrayList<>();
        if (root == null)
            return result;
        traverse(root, 0);
        int size = result.size();
        for (int i = 0; i < size / 2; i++) {
            List<Integer> temp = result.get(i);
            result.set(i, result.get(size - i - 1));
            result.set(size - i - 1, temp);
        }
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

    public List<List<Integer>> levelOrderBottom2(TreeNode root) {
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
        int size = result.size();
        for (int i = 0; i < size / 2; i++) {
            List<Integer> temp = result.get(i);
            result.set(i, result.get(size - i - 1));
            result.set(size - i - 1, temp);
        }
        return result;
    }

}
