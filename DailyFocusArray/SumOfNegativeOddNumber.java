package com.gla.DSA.DailyFocusArray;

import java.util.Scanner;

public class SumOfNegativeOddNumber {
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
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] < 0 && arr[i] % 2 != 0) {
                count++;
                sum += arr[i];
            }
        }
        System.out.print("Total sum " +sum);
    }
}
