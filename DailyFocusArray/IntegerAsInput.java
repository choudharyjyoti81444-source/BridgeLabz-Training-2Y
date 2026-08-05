package com.gla.DSA.DailyFocusArray;

import java.util.Scanner;

public class IntegerAsInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter" +n+ "elements" );
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Elements are:");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
