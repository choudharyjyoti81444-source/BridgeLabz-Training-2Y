package com.gla.DSA.DailyFocusArray.ReviewPractice;

import java.util.Scanner;

public class AlphabetTringle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
}