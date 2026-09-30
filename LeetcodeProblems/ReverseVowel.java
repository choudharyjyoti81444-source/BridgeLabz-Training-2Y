package com.gla.LeetcodeProblems;

import java.util.*;
public class ReverseVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if ("aeiouAEIOU".indexOf(arr[left]) == -1) {
                left++;
            }
            else if ("aeiouAEIOU".indexOf(arr[right]) == -1) {
                right--;
            }
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        System.out.println("Reversed vowels: " + new String(arr));
        sc.close();
    }
}
