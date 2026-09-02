package com.gla.LeetcodeProblems;

public class MaxConsecutive {
    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 0, 0, 1, 1, 1};
        int k = 2;

        int left = 0;
        int zero = 0;
        int max = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                zero++;
            }

            while (zero > k) {
                if (nums[left] == 0) {
                    zero--;
                }
                left++;
            }

            int length = right - left + 1;

            if (length > max) {
                max = length;
            }
        }

        System.out.println(max);
    }
}
