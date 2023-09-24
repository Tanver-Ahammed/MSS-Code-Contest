package com.tanver.Competitive.ostad.app.tree;

import java.util.Scanner;

/**
 * print the sub tree
 */
public class AssignmentOnTree {

    static class Tree {
        int data;
        Tree left;
        Tree right;

        public Tree(int data) {
            this.data = data;
        }
    }

    // insert value in BST
    private static Tree insertBST(Tree root, int data) {
        if (root == null)
            return new Tree(data);
        // left sub tree
        if (data < root.data)
            root.left = insertBST(root.left, data);
            // left sub tree
        else
            root.right = insertBST(root.right, data);
        return root;
    }

    // sub tree
    private static Tree subTree(Tree root, int subTreeRootVal) {
        if (root == null || root.data == subTreeRootVal)
            return root;
        if (subTreeRootVal < root.data)
            return subTree(root.left, subTreeRootVal);
        else
            return subTree(root.right, subTreeRootVal);
    }

    // inorder traversal
    private static void inorder(Tree root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        inorder(root.left);
        inorder(root.right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Tree root = null;
        for (int i = 0; i < n; i++)
            root = insertBST(root, scanner.nextInt());
        int subTreeRootVal = scanner.nextInt();
        Tree subTreeRoot = subTree(root, subTreeRootVal);
        inorder(subTreeRoot);
    }

}
