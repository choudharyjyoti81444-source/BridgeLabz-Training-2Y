package com.gla.LeetcodeProblems;

import java.util.*;
public class AddDigits {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    while (num >= 10) {

        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }

        num = sum;
    }

    System.out.println("Result: " + num);
}
}
