package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P94_BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal1(TreeNode root) {
        return inorderTree(root, new ArrayList<>());
    }

    private List<Integer> inorderTree(TreeNode root, List<Integer> inorderList) {
        if (root == null)
            return inorderList;
        inorderTree(root.left, inorderList);
        inorderList.add(root.val);
        inorderTree(root.right, inorderList);
        return inorderList;
    }

    public List<Integer> inorderTraversal2(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        List<Integer> inOrderTreeList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || stack.size() > 0) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            inOrderTreeList.add(curr.val);
            curr = curr.right;
        }
        return inOrderTreeList;
    }

}
