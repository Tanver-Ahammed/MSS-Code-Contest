package com.tanver.study.apna.college.tree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {

    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
//            this.left = null;
//            this.right = null;
        }
    }

    // insert value in binary search tree
    private static Node insertNode(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.value) {
            // left sub tree
            root.left = insertNode(root.left, value);
        } else {
            // right sub tree
            root.right = insertNode(root.right, value);
        }
        return root;
    }

    // preorder traversal in binary search tree
    private static void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // inorder traversal in binary search tree
    private static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }

    // inorder traversal in binary search tree
    private static void postorder(Node root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value + " ");
    }

    // search node in BST
    private static boolean search(Node root, int sVal) {
        if (root == null)
            return false;
        if (sVal < root.value)
            return search(root.left, sVal);
        else if (sVal > root.value)
            return search(root.right, sVal);
        else
            return true;
    }

    // delete node in BST
    private static Node delete(Node root, int delVal) {
        if (delVal < root.value) {
            root.left = delete(root.left, delVal);
        } else if (delVal > root.value) {
            root.right = delete(root.right, delVal);
        } else { // delVal == root.val
            // case-1: no child
            if (root.left == null && root.right == null)
                return null;
            // case-2: 1 child
            if (root.left == null)
                return root.right;
            if (root.right == null)
                return root.left;

            // case-3: 2 child
            Node is = inorderSuccessor(root.right);
            root.value = is.value;
            root.right = delete(root.right, is.value);
        }
        return root;
    }

    private static Node inorderSuccessor(Node right) {
        while (right.left != null) {
            right = right.left;
        }
        return right;
    }

    // print value in a range in BST
    private static void printRange(Node root, int x, int y) {
        if (root == null) {
            return;
        }
        printRange(root.left, x, y);
        if (root.value >= x && root.value <= y) {
            System.out.print(root.value + " ");
        }
        printRange(root.right, x, y);
    }

    // print root to leaf
    private static void printRoot2Leaf(Node root, List<Integer> path) {
        if (root == null)
            return;
        path.add(root.value);

        // leaf
        if (root.left == null && root.right == null) {
            printPath(path);
        } else {
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }
        path.remove(path.size() - 1);
    }

    private static void printPath(List<Integer> path) {
        for (Integer integer : path) {
            System.out.print(integer + "->");
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Node root = null;
        int[] values = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        for (int value : values) {
            root = insertNode(root, value);
        }
        System.out.println("Root: " + root.value);
        System.out.print("\nPerOder: ");
        preorder(root);

        System.out.print("\n\nInOder: ");
        inorder(root);

        System.out.print("\n\nPostOder: ");
        postorder(root);

        System.out.println("\n\nSearch Value: " + search(root, 3));

        System.out.println("\nDelete Value: " + delete(root, 5));

        System.out.print("\nInOder: ");
        inorder(root);

        System.out.print("\n\nPrint in a Range: ");
        printRange(root, 3, 12);

        System.out.println("\n\nPrint root to leaf: ");
        printRoot2Leaf(root, new ArrayList<>());


    }

}
