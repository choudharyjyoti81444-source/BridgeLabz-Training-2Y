package com.gla.LeetcodeProblems;

import java.util.Scanner;
public class FindPoisonedDuration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] timeSeries = new int[n];

        for (int i = 0; i < n; i++) {
            timeSeries[i] = sc.nextInt();
        }

        int duration = sc.nextInt();

        int total = 0;

        for (int i = 0; i < n - 1; i++) {
            total += Math.min(duration, timeSeries[i + 1] - timeSeries[i]);
        }

        if (n > 0) {
            total += duration;
        }

        System.out.println(total);
    }
}
