package com.codingChallenge.Tree;

public class BalancedBinaryTree extends BinarySearchTree {

    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int leftChecker = Length(root.left);
        int rightChecker = Length(root.right);
        if (Math.abs(leftChecker - rightChecker) > 1) return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }

    public static int Length(TreeNode node) {
        if (node == null) return 0;
        int left = Length(node.left);
        int right = Length(node.right);

        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {

    }
}