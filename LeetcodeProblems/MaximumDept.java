package com.gla.LeetcodeProblems;
import java.util.*;

public class MaximumDept {
    static class Node {
        int val;
        List<Node> children;

        Node(int val) {
            this.val = val;
            children = new ArrayList<>();
        }
    }

    public static int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        for (Node child : root.children) {
            max = Math.max(max, maxDepth(child));
        }
        return max + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println(0);
            sc.close();
            return;
        }

        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(sc.nextInt());
        }

        for (int i = 0; i < n; i++) {
            int childrenCount = sc.nextInt();
            for (int j = 0; j < childrenCount; j++) {
                int childIndex = sc.nextInt();
                nodes[i].children.add(nodes[childIndex]);
            }
        }
        System.out.println(maxDepth(nodes[0]));
    }
}
