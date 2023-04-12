package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class P589_NaryTreePreorderTraversal {

    static class Node {
        public int val;
        public List<P590_NaryTreePostorderTraversal.Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<P590_NaryTreePostorderTraversal.Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> preorder(P590_NaryTreePostorderTraversal.Node root) {
        return naryPreOrder(root, new ArrayList<>());
    }

    private List<Integer> naryPreOrder(P590_NaryTreePostorderTraversal.Node root, List<Integer> postOrderList) {
        if (root != null) {
            postOrderList.add(root.val);
            for (int i = 0; i < root.children.size(); i++) {
                naryPreOrder(root.children.get(i), postOrderList);
            }
        }
        return postOrderList;
    }

}
