package com.tanver.Competitive.leetcode.problems;

import java.util.LinkedList;
import java.util.Queue;

public class P559_MaximumDepthOfNaryTree {

    public int maxDepth1(Node root) {
        if (root == null)
            return 0;
        int depth = 0;
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        while (!Q.isEmpty()) {
            int n = Q.size();
            double sum = 0;
            for (int i = 0; i < n; i++) {
                Node current = Q.poll();
                assert current != null;
                sum += current.val;
                for (Node node : current.children)
                    Q.offer(node);
            }
            depth++;
        }
        return depth;
    }

    public int maxDepth(Node root) {
        if (root == null)
            return 0;
        int max = 0;
        for (Node child : root.children) {
            int value = maxDepth(child);
            if (value > max)
                max = value;
        }
        return max + 1;
    }

}
