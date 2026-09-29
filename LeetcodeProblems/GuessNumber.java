package com.gla.LeetcodeProblems;
import java.util.*;
public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter pick: ");
        int pick = sc.nextInt();

        int low = 1;
        int high = n;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid == pick) {
                ans = mid;
                break;
            }
            else if (mid > pick) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        System.out.println("Guessed number: " + ans);
    }
}
