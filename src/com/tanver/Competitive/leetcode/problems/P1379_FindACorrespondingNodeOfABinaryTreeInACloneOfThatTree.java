package com.tanver.Competitive.leetcode.problems;

public class P1379_FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree {

    public final TreeNode getTargetCopy1(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null || original == target)
            return cloned;
        TreeNode result = getTargetCopy1(original.left, cloned.left, target);
        if (result != null)
            return result;
        return getTargetCopy1(original.right, cloned.right, target);
    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null)
            return null;
        if (original == target)
            return cloned;
        TreeNode left = getTargetCopy(original.left, cloned.left, target);
        if (left != null)
            return left;
        else
            return getTargetCopy(original.right, cloned.right, target);
    }

}
