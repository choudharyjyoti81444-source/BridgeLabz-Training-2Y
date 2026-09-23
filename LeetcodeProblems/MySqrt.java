package com.gla.LeetcodeProblems;

import java.util.*;
public class MySqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        int i = 0;

        while ((long) i * i <= x) {
            i++;
        }

        System.out.println("Square root: " + (i - 1));
    }
}
