package com.gla.LeetcodeProblems;
import java.util.Arrays;
import java.util.Scanner;

public class CheckInclusion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter s1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter s2: ");
        String s2 = sc.nextLine();

        int n1 = s1.length();
        int n2 = s2.length();

        if (n2 < n1) {
            System.out.println(false);
            return;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (int i = 0; i < n1; i++) {
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(count1, count2)) {
            System.out.println(true);
            return;
        }

        for (int i = n1; i < n2; i++) {
            count2[s2.charAt(i) - 'a']++;
            count2[s2.charAt(i - n1) - 'a']--;

            if (Arrays.equals(count1, count2)) {
                System.out.println(true);
                return;
            }
        }

        System.out.println(false);
    }
}
