package com.gla.StackAndQueues;
import java.util.*;

public class LongestConsecutiveSequence {
    static int findLongest(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int x : arr)
            set.add(x);

        int longest = 0;

        for (int x : set) {

            if (!set.contains(x - 1)) {
                int current = x;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(findLongest(arr));
    }
}
