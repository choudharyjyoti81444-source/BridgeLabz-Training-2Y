package com.gla.LeetcodeProblems;

import java.util.*;
public class ClimbStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stairs: ");
        int n = sc.nextInt();

        if (n <= 2) {
            System.out.println("Number of ways: " + n);
            return;
        }

        int first = 1;
        int second = 2;

        for (int i = 3; i <= n; i++) {

            int third = first + second;

            first = second;
            second = third;
        }

        System.out.println("Number of ways: " + second);
    }
}
