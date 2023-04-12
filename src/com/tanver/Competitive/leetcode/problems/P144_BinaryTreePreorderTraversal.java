package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P144_BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal1(TreeNode root) {
        return result(root, new ArrayList<>());
    }

    private List<Integer> result(TreeNode root, List<Integer> list) {
        if (root == null)
            return list;
        list.add(root.val);
        result(root.left, list);
        result(root.right, list);
        return list;
    }

    public List<Integer> preorderTraversal2(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        List<Integer> preOrderTreeList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            TreeNode currentTop = stack.peek();
            preOrderTreeList.add(currentTop.val);
            stack.pop();
            if (currentTop.right != null)
                stack.push(currentTop.right);
            if (currentTop.left != null)
                stack.push(currentTop.left);
        }
        return preOrderTreeList;
    }



}
