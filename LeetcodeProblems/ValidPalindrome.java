package com.gla.LeetcodeProblems;

import java.util.*;
public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int left = 0;
        int right = s.length() - 1;
        int count = 0;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                count++;

                if (count > 1) {
                    System.out.println(false);
                    return;
                }

                if (s.charAt(left + 1) == s.charAt(right)) {
                    left++;
                } else {
                    right--;
                }

            } else {
                left++;
                right--;
            }
        }
        System.out.println(true);
    }
}
