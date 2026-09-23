package com.gla.LeetcodeProblems;

import java.util.*;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] >= target) {
                System.out.println("Insert position: " + i);
                return;
            }
        }

        System.out.println("Insert position: " + nums.length);
    }
}
