package com.gla.LeetcodeProblems;

public class MaxSatisfied {
    public static void main(String[] args) {
        int[] customers = {1, 0, 1, 2, 1, 1, 7, 5};
        int[] grumpy = {0, 1, 0, 1, 0, 1, 0, 1};
        int minutes = 3;

        int total = 0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                total += customers[i];
            }
        }

        int extra = 0;
        int maxExtra = 0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 1) {
                extra += customers[i];
            }

            if (i >= minutes && grumpy[i - minutes] == 1) {
                extra -= customers[i - minutes];
            }

            maxExtra = Math.max(maxExtra, extra);
        }

        int result = total + maxExtra;
        System.out.println("Maximum satisfied customers: " + result);
    }
}
