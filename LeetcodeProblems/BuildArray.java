package com.gla.LeetcodeProblems;

import java.util.*;
public class BuildArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = nums[nums[i]];
        }

        System.out.println("Result array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
