package com.gla.DSA.DailyFocusArray;

import java.util.Scanner;

public class MaximumMinimumElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Element:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter" + n + "Elements");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            else if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Maximum Element = " +max);
        System.out.println("Minimum Element = " +min);
    }
}
