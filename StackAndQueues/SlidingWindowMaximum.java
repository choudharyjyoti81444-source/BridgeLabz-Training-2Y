package com.gla.StackAndQueues;
import java.util.*;

public class SlidingWindowMaximum {
    static void findMaximum(int[] arr, int n, int k) {
        if (k <= 0 || k > n) {
            System.out.println("Invalid Window Size");
            return;
        }

        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            while (!dq.isEmpty() && dq.peekFirst() <= i - k)
                dq.pollFirst();

            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i])
                dq.pollLast();

            dq.offerLast(i);

            if (i >= k - 1)
                System.out.print(arr[dq.peekFirst()] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int k = sc.nextInt();

        findMaximum(arr, n, k);
    }
}
