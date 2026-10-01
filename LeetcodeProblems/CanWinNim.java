package com.gla.LeetcodeProblems;
import java.util.*;
public class CanWinNim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 4 == 0) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}
