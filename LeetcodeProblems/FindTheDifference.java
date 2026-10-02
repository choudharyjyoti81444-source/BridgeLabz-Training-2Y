package com.gla.LeetcodeProblems;

import java.util.*;
public class FindTheDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string s: ");
        String s = sc.nextLine();

        System.out.print("Enter string t: ");
        String t = sc.nextLine();

        int sum = 0;

        for (int i = 0; i < t.length(); i++) {
            sum += t.charAt(i);
        }

        for (int i = 0; i < s.length(); i++) {
            sum -= s.charAt(i);
        }

        System.out.println("Difference: " + (char) sum);
    }
}
