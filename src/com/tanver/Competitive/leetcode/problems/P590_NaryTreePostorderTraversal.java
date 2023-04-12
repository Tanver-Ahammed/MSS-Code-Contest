package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class P590_NaryTreePostorderTraversal {

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> postorder(Node root) {
        return naryPostOrder(root, new ArrayList<>());
    }

    private List<Integer> naryPostOrder(Node root, List<Integer> postOrderList) {
        if (root != null) {
            for (int i = 0; i < root.children.size(); i++) {
                naryPostOrder(root.children.get(i), postOrderList);
            }
            postOrderList.add(root.val);
        }
        return postOrderList;
    }

}
