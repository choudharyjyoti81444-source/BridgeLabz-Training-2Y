package com.gla.LeetcodeProblems;
import java.util.Scanner;
public class NumberOfSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int count = 0;

        while (num != 0) {

            if ((num & 1) == 0) {
                num = num >> 1;
            } else {
                num = num - 1;
            }

            count++;
        }

        System.out.println("Number of steps: " + count);
    }
}
