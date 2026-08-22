package com.gla.DSA.DailyFocusArray;

import java.util.Scanner;

public class AverageOfNegativeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " +n+ " Element");
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int count = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] < 0){
                sum += arr[i];
                count++;
            }
        }
        double average = (double) sum/count;
        System.out.print("Negative Average: " +average);
    }
}
