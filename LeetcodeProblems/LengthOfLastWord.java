package com.gla.LeetcodeProblems;

import java.util.*;
public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        s = s.trim();

        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }

        System.out.println("Length of last word: " + count);
    }
}
