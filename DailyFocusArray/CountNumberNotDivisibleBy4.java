package com.gla.DSA.DailyFocusArray;

import java.util.Scanner;

public class CountNumberNotDivisibleBy4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an ELement: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " Element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 4 != 0) {
                count++;
            }
        }
        System.out.print("Total Count " + count);
    }
}
