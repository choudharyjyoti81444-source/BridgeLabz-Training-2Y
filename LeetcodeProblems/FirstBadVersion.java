package com.gla.LeetcodeProblems;
import java.util.*;
public class FirstBadVersion {int low = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bad = sc.nextInt();

        int low = 1;
        int high = n;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (mid >= bad) {
                high = mid;
            }
            else {
                low = mid + 1;
            }
        }
        System.out.println(low);
    }
}
