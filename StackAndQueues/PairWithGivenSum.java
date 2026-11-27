package com.gla.StackAndQueues;
import java.util.*;
public class PairWithGivenSum {
    static void findPair(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            int complement = target - x;

            if (set.contains(complement)) {
                System.out.println(complement + " " + x);
                return;
            }

            set.add(x);
        }

        System.out.println("Pair Not Found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int target = sc.nextInt();

        findPair(arr, target);
    }
}
