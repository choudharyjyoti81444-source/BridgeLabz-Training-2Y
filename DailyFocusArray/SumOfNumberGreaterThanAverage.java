package com.gla.DSA.DailyFocusArray;

import java.util.Scanner;

public class SumOfNumberGreaterThanAverage { public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter An Array: ");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.print("Enter " +n+ " Element");
    for(int i=0; i<arr.length; i++){
        arr[i] = sc.nextInt();
    }

    int sum = 0;
    for(int i=0; i<arr.length; i++){
        sum +=  arr[i];
    }

    double average = (double) sum/ arr.length;

    int greaterSum = 0;
    for(int i=0; i<arr.length; i++){
        if(arr[i] > average){
            greaterSum += arr[i];
        }
    }


    System.out.println("Total  " +greaterSum);
}
}
