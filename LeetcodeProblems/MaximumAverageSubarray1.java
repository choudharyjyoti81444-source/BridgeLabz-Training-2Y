package com.gla.LeetcodeProblems;

public class MaximumAverageSubarray1 {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int max = sum;
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            if (sum > max) {
                max = sum;
            }
        }

        double answer = (double) max / k;
        System.out.println(answer);
    }
}
