package com.gla.LeetcodeProblems;

import java.util.Scanner;
public class CheckSortedRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }
        }

        if(count <= 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
