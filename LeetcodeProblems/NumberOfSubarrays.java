package com.gla.LeetcodeProblems;

public class NumberOfSubarrays {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 5, 5};
        int k = 3;
        int threshold = 4;

        int sum = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        if (sum >= k * threshold) {
            count++;
        }

        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            if (sum >= k * threshold) {
                count++;
            }
        }

        System.out.println(count);
    }
}
