package com.gla.DSA.DailyFocusArray;

import java.util.Scanner;

public class SmallestPositiveNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " +n+ " Element");
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int Smallest = Integer.MAX_VALUE;
        for(int i=0; i< arr.length; i++){
            if(arr[i] > 0 && arr[i] < Smallest){
                Smallest = arr[i];
            }
        }
        System.out.print("Smallest Positive Number: " +Smallest);
    }
}
