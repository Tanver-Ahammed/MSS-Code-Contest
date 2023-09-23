package com.tanver.Competitive.leetcode;

import com.tanver.Competitive.leetcode.problems.TreeNode;

import java.util.*;

public class P2583_KthLargestSumInABinaryTree {

    public long kthLargestLevelSum(TreeNode root, int k) {
        long levelSum = 0;
        List<Long> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            TreeNode currNode = q.remove();
            if (currNode == null) {
                list.add(levelSum);
                if (q.isEmpty())
                    break;
                q.add(null);
                levelSum = 0;
            } else {
                levelSum += currNode.val;
                if (currNode.left != null)
                    q.add(currNode.left);
                if (currNode.right != null)
                    q.add(currNode.right);
            }
        }
        if (k > list.size())
            return -1;
        Collections.sort(list);
        return list.get(list.size() - k);
    }

}
