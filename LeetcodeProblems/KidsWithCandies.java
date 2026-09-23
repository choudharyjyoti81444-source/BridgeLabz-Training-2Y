package com.gla.LeetcodeProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class KidsWithCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of kids: ");
        int n = sc.nextInt();

        int[] candies = new int[n];

        System.out.println("Enter candies for each kid:");
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
        }

        System.out.print("Enter extra candies: ");
        int extraCandies = sc.nextInt();

        List<Boolean> list = new ArrayList<>();

        int max = 0;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {

            int total = candies[i] + extraCandies;

            if (total >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }

        System.out.println("Result:");

        for (boolean value : list) {
            System.out.print(value + " ");
        }
    }
}
