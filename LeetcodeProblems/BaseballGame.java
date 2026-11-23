package com.gla.LeetcodeProblems;

import java.util.Scanner;
public class BaseballGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] operations = new String[n];

        for (int i = 0; i < n; i++) {
            operations[i] = sc.next();
        }

        int[] stack = new int[operations.length];
        int top = -1;
        for (String op : operations) {
            if (op.equals("+")) {
                int sum = stack[top] + stack[top - 1];
                top++;
                stack[top] = sum;
            }
            else if (op.equals("D")) {
                int doubleScore = 2 * stack[top];
                top++;
                stack[top] = doubleScore;
            }
            else if (op.equals("C")) {
                top--;
            }
            else {
                top++;
                stack[top] = Integer.parseInt(op);
            }
        }

        int total = 0;
        for (int i = 0; i <= top; i++) {
            total += stack[i];
        }

        System.out.println(total);
    }
}
