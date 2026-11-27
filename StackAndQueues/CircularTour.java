package com.gla.StackAndQueues;
import java.util.*;

public class CircularTour {
    static int findTour(int[] petrol, int[] distance, int n) {
        int start = 0;
        int balance = 0;
        int deficit = 0;

        for (int i = 0; i < n; i++) {
            balance += petrol[i] - distance[i];

            if (balance < 0) {
                start = i + 1;
                deficit += balance;
                balance = 0;
            }
        }

        if (balance + deficit >= 0 && start < n)
            return start;

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] petrol = new int[n];
        int[] distance = new int[n];

        for (int i = 0; i < n; i++) {
            petrol[i] = sc.nextInt();
            distance[i] = sc.nextInt();
        }

        System.out.println(findTour(petrol, distance, n));
    }
}
