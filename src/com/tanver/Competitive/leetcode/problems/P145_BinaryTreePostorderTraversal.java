package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P145_BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversal1(TreeNode root) {
        return postOrder(root, new ArrayList<>());
    }

    private List<Integer> postOrder(TreeNode root, List<Integer> postOrderList) {
        if (root != null) {
            postOrder(root.left, postOrderList);
            postOrder(root.right, postOrderList);
            postOrderList.add(root.val);
        }
        return postOrderList;
    }

    public List<Integer> postOrderIterative(TreeNode root) {
        List<Integer>postOrderList = new ArrayList<>();
        if (root == null)
            return postOrderList;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        TreeNode prev = null;
        while (!stack.isEmpty()) {
            TreeNode current = stack.peek();
            if (prev == null || prev.left == current || prev.right == current) {
                if (current.left != null)
                    stack.push(current.left);
                else if (current.right != null)
                    stack.push(current.right);
                else {
                    stack.pop();
                    postOrderList.add(current.val);
                }
            } else if (current.left == prev) {
                if (current.right != null)
                    stack.push(current.right);
                else {
                    stack.pop();
                    postOrderList.add(current.val);
                }
            } else if (current.right == prev) {
                stack.pop();
                postOrderList.add(current.val);
            }
            prev = current;
        }
        return postOrderList;
    }

}
