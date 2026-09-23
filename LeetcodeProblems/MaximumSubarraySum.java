package com.gla.LeetcodeProblems;
import java.util.HashMap;
import java.util.Scanner;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        long maxSum = 0;
        long sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        if (map.size() == k) {
            maxSum = sum;
        }

        for (int i = k; i < nums.length; i++) {
            sum -= nums[i - k];
            map.put(nums[i - k], map.get(nums[i - k]) - 1);

            if (map.get(nums[i - k]) == 0) {
                map.remove(nums[i - k]);
            }

            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println("Maximum subarray sum: " + maxSum);
    }
}
