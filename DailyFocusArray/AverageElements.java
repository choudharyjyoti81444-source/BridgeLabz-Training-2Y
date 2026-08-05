package com.gla.DSA.DailyFocusArray;

import java.util.Scanner;

public class AverageElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Element");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " +n+ " Element");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        System.out.println("Average Elements ");
        for(int i=0; i<arr.length; i++){
            sum += arr[i];

        }
        double average = (double) sum / arr.length;
        System.out.println(+average);
    }
}
