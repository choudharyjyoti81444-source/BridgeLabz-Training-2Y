package com.gla.LeetcodeProblems;

import java.util.Scanner;
public class LicenseKeyFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int k = sc.nextInt();

        s = s.replace("-", "").toUpperCase();

        StringBuilder result = new StringBuilder();
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));
            count++;

            if (count == k && i > 0) {
                result.append("-");
                count = 0;
            }
        }

        System.out.println(result.reverse().toString());
    }
}
