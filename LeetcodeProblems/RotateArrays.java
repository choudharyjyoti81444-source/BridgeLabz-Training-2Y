package com.gla.LeetcodeProblems;

import java.util.*;
public class RotateArrays {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;

        int n = nums.length;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }

        System.out.println(Arrays.toString(nums));
    }
}
