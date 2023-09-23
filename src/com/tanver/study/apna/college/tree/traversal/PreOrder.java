package com.tanver.study.apna.college.tree.traversal;

import java.util.LinkedList;
import java.util.Queue;

public class PreOrder {

    static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class TreeInfo {
        int ht;
        int diam;

        public TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    static class BinaryTree {
        static int index = -1;

        public static Node buildTree(int[] nodes) {
            index++;
            if (nodes[index] == -1)
                return null;
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        // pre-order traversal
        public static void preOrder(Node root) {
            if (root == null)
                return;
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        // in-order traversal
        public static void inOrder(Node root) {
            if (root == null)
                return;
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        // post-order traversal
        public static void postOrder(Node root) {
            if (root == null)
                return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        // level-order traversal
        public static void levelOrder(Node root) {
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            queue.add(null);
            while (!queue.isEmpty()) {
                Node currentNode = queue.remove();
                if (currentNode == null) {
                    System.out.println();
                    if (queue.isEmpty())
                        break;
                    queue.add(null);
                } else {
                    System.out.print(currentNode.data + " ");
                    if (currentNode.left != null)
                        queue.add(currentNode.left);
                    if (currentNode.right != null)
                        queue.add(currentNode.right);
                }
            }
        }

        // count total nodes of a tree
        public static int countTotalNodes(Node root) {
            if (root == null)
                return 0;
            return countTotalNodes(root.left) + countTotalNodes(root.right) + 1;
        }

        // sum of all nodes of the tree
        public static int sumOfAllNodes(Node root) {
            if (root == null)
                return 0;
            return sumOfAllNodes(root.left) + sumOfAllNodes(root.right) + root.data;
        }

        // height of tree
        public static int heightOfTree(Node root) {
            if (root == null)
                return 0;
            return Math.max(heightOfTree(root.left), heightOfTree(root.right)) + 1;
        }

        // diameter of tree
        // Time Complexity: O(n^2)
        public static int diameter1(Node root) {
            if (root == null)
                return 0;
            int diameterLeft = diameter1(root.left);
            int diameterRight = diameter1(root.right);
            int diameterRoot = heightOfTree(root.left) + heightOfTree(root.right) + 1;
            return Math.max(Math.max(diameterLeft, diameterRight), diameterRoot);
        }

        // diameter of tree
        // Time Complexity: O(n)
        public static TreeInfo diameter2(Node root) {
            if (root == null)
                return new TreeInfo(0, 0);
            TreeInfo leftTI = diameter2(root.left);
            TreeInfo rightTI = diameter2(root.right);
            int myHeight = Math.max(leftTI.ht, rightTI.ht) + 1;
            int diam1 = leftTI.ht + rightTI.ht + 1;
            int diam2 = leftTI.diam;
            int diam3 = rightTI.diam;
            int myDiam = Math.max(diam1, Math.max(diam2, diam3));
            return new TreeInfo(myHeight, myDiam);
        }

        //
        public boolean isIdentical(Node root, Node subRoot) {
            if (subRoot == null && root == null) {
                return true;
            }
            if (root == null || subRoot == null) {
                return false;
            }
            if (root.data == subRoot.data) {
                return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
            }
            return false;
        }

        public boolean isSubtree(Node root, Node subRoot) {
            if (subRoot == null) {
                return true;
            }
            if (root == null) {
                return false;
            }
            if (isIdentical(root, subRoot)) {
                return true;
            }
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }


    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = BinaryTree.buildTree(nodes);
        System.out.println("Root: " + root.data);
        System.out.println("\nPerOder:");
        BinaryTree.preOrder(root);

        System.out.println("\n\nInOder:");
        BinaryTree.inOrder(root);

        System.out.println("\n\npostOder:");
        BinaryTree.postOrder(root);

        System.out.println("\n\nLevelOrder: ");
        BinaryTree.levelOrder(root);

        System.out.println("\nCount Total Nodes: " + BinaryTree.countTotalNodes(root));

        System.out.println("\nSum of All Nodes: " + BinaryTree.sumOfAllNodes(root));

        System.out.println("\nHeight of the Tree: " + BinaryTree.heightOfTree(root));

        System.out.println("\nDiameter: " + BinaryTree.diameter1(root));

        System.out.println("\nDiameter: " + BinaryTree.diameter2(root).diam);


    }

}
