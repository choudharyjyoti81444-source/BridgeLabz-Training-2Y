package com.gla.LeetcodeProblems;

import java.util.*;
public class MinimumSizeSubArraysSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int min = n + 1;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += nums[j];

                if (sum >= target) {
                    int length = j - i + 1;

                    if (length < min) {
                        min = length;
                    }

                    break;
                }
            }
        }

        if (min == n + 1) {
            System.out.println(0);
        } else {
            System.out.println(min);
        }
    }
}
