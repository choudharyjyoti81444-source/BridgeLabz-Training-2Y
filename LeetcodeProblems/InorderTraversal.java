package com.gla.LeetcodeProblems;

import java.util.*;

public class InorderTraversal {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static void inorderTraversal(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left, result);
        result.add(root.val);
        inorderTraversal(root.right, result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter root value: ");
        int value = sc.nextInt();

        TreeNode root = new TreeNode(value);

        System.out.print("Enter left value: ");
        value = sc.nextInt();
        root.left = new TreeNode(value);

        System.out.print("Enter right value: ");
        value = sc.nextInt();
        root.right = new TreeNode(value);

        List<Integer> result = new ArrayList<>();
        inorderTraversal(root, result);
        System.out.println("Inorder Traversal: " + result);
    }
}