package com.tanver.Competitive.leetcode.problems;

import java.util.Objects;

public class P606_ConstructStringFromBinaryTree {

    public String tree2str(TreeNode root) {
        if (root == null)
            return "";

        String result = String.valueOf(root.val);

        String left = tree2str(root.left);
        String right = tree2str(root.right);

        if (Objects.equals(left, "") && Objects.equals(right, ""))
            return result;
        if (Objects.equals(left, ""))
            return result + "()" + "(" + right + ")";
        if (Objects.equals(right, ""))
            return result + "(" + left + ")";
        return result + "(" + left + ")" + "(" + right + ")";
    }

}
