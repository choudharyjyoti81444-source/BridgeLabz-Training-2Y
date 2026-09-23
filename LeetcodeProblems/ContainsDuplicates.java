package com.gla.LeetcodeProblems;

import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                System.out.println(true);
                return;
            }

            set.add(num);
        }

        System.out.println(false);
    }
}
