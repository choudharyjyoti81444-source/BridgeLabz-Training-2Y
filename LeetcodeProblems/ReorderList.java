package com.gla.LeetcodeProblems;

import java.util.*;
public class ReorderList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;

        while (left <= right) {

            if (left == right) {
                System.out.print(arr[left]);
            } else {
                System.out.print(arr[left] + " " + arr[right]);
            }

            if (left + 1 <= right) {
                System.out.print(" ");
            }

            left++;
            right--;
        }
    }
}
