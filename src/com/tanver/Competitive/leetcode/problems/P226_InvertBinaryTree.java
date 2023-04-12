package com.tanver.Competitive.leetcode.problems;

import java.util.LinkedList;

public class P226_InvertBinaryTree {

    public TreeNode invertTree1(TreeNode root) {
        if (root == null)
            return null;
        TreeNode left = invertTree1(root.left);
        TreeNode right = invertTree1(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    public TreeNode invertTree2(TreeNode root) {
        LinkedList<TreeNode> q = new LinkedList<>();
        if (root != null)
            q.add(root);
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
            TreeNode curr = temp.left;
            temp.left = temp.right;
            temp.right = curr;
        }
        return root;
    }

}
