package com.gla.LeetcodeProblems;

import java.util.*;
public class CountBinarySubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary string: ");
        String s = sc.next();

        int prev = 0;
        int curr = 1;
        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curr++;
            } else {
                count += Math.min(prev, curr);
                prev = curr;
                curr = 1;
            }
        }

        count += Math.min(prev, curr);

        System.out.println(count);
    }
}
