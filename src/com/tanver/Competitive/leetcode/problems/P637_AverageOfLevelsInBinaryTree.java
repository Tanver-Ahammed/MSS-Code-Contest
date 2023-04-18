package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P637_AverageOfLevelsInBinaryTree {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> avgLevel = new ArrayList<>();
        Queue<TreeNode> Q = new LinkedList<>();
        Q.offer(root);
        while (!Q.isEmpty()) {
            int n = Q.size();
            double sum = 0;
            for (int i = 0; i < n; i++) {
                TreeNode current = Q.poll();
                assert current != null;
                sum += current.val;
                if (current.left != null)
                    Q.offer(current.left);
                if (current.right != null)
                    Q.offer(current.right);
            }
            avgLevel.add(sum / n);
        }
        return avgLevel;
    }

}
