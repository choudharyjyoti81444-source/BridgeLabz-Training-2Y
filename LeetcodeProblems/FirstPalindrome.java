package com.gla.LeetcodeProblems;
import java.util.Scanner;

public class FirstPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();

        String[] words = new String[n];

        System.out.println("Enter words:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            int left = 0;
            int right = word.length() - 1;

            while (left < right) {

                if (word.charAt(left) != word.charAt(right)) {
                    break;
                }

                left++;
                right--;
            }

            if (left >= right) {
                System.out.println("First palindrome: " + word);
                return;
            }
        }

        System.out.println("No palindrome found");
    }
}
