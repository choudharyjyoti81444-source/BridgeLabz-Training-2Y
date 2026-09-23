package com.gla.LeetcodeProblems;

import java.util.*;
public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        while (n != 1 && n != 4) {

            int sum = 0;

            while (n > 0) {

                int d = n % 10;
                sum += d * d;
                n /= 10;
            }

            n = sum;
        }

        System.out.println(n == 1);
    }
}
