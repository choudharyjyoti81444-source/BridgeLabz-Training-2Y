package com.gla.LeetcodeProblems;

import java.util.*;
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println(false);
            return;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }

        System.out.println(n == 1);
    }
}
