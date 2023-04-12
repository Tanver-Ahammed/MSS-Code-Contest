package com.tanver.Competitive.leetcode.problems;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);

        tree.left = new TreeNode(2);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);


        tree.right = new TreeNode(3);
        tree.right.left = new TreeNode(6);
        tree.right.right = new TreeNode(7);

        Main main = new Main();

//        System.out.println(main.countNodes(tree));

    }
}