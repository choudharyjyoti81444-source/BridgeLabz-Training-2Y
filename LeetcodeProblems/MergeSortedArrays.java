package com.gla.LeetcodeProblems;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter m: ");
        int m = sc.nextInt();

        int[] nums1 = new int[m + 3];

        System.out.println("Enter nums1 elements:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] nums2 = new int[n];

        System.out.println("Enter nums2 elements:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        int j = 0;

        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[j];
            j++;
        }

        Arrays.sort(nums1);
        System.out.println("Merged array: " + Arrays.toString(nums1));
    }
}
