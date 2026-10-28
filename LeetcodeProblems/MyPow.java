package com.gla.LeetcodeProblems;

import java.util.*;
public class MyPow {
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        double half = myPow(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else if (n > 0) {
            return half * half * x;
        } else {
            return half * half / x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        int n = sc.nextInt();

        System.out.println(myPow(x, n));

        sc.close();
    }
}
