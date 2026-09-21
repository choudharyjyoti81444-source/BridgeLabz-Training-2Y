package com.gla.LeetcodeProblems;
import java.util.*;
public class SubarraysWithKDistinct {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {

            int[] freq = new int[n + 1];
            int distinct = 0;

            for (int j = i; j < n; j++) {

                if (freq[nums[j]] == 0) {
                    distinct++;
                }

                freq[nums[j]]++;

                if (distinct == k) {
                    count++;
                }

                if (distinct > k) {
                    break;
                }
            }
        }

        System.out.println("Answer: " + count);
    }
}
