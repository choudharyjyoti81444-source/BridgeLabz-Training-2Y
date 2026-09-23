package com.gla.LeetcodeProblems;

import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        k = k % n;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }

        System.out.println("Rotated array:");

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
