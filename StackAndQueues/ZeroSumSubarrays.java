package com.gla.StackAndQueues;
import java.util.*;

public class ZeroSumSubarrays {
    static void findSubarrays(int[] arr, int n) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        int sum = 0;
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        boolean found = false;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    System.out.println((start + 1) + " to " + i);
                    found = true;
                }
            }

            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }

        if (!found)
            System.out.println("No Zero Sum Subarray");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        findSubarrays(arr, n);
    }
}
