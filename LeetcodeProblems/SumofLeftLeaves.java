package com.gla.LeetcodeProblems;

import java.util.*;
public class SumofLeftLeaves {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int sum = 0;
        if (root.left != null &&
                root.left.left == null &&
                root.left.right == null) {
            sum += root.left.val;
        }

        sum += sumOfLeftLeaves(root.left);
        sum += sumOfLeftLeaves(root.right);

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println(0);
            sc.close();
            return;
        }

        TreeNode root = new TreeNode(sc.nextInt());
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int count = 1;

        while (!queue.isEmpty() && count < n) {
            TreeNode current = queue.poll();

            int leftVal = sc.nextInt();
            count++;

            if (leftVal != -1) {
                current.left = new TreeNode(leftVal);
                queue.add(current.left);
            }

            if (count < n) {
                int rightVal = sc.nextInt();
                count++;

                if (rightVal != -1) {
                    current.right = new TreeNode(rightVal);
                    queue.add(current.right);
                }
            }
        }

        System.out.println(sumOfLeftLeaves(root));
    }
}
