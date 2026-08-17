package com.gla.DSA.Class;

import java.util.Scanner;

public class ArraySumForTargetElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int count = 0;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){

                if(arr[i] + arr[j] == target){
                    count++;

                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }

        System.out.println("Total Outcomes = " + count);
    }
}
