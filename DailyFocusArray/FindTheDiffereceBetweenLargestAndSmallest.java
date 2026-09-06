package com.gla.DSA.DailyFocusArray;

import java.util.Scanner;

public class FindTheDiffereceBetweenLargestAndSmallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int smallest = arr[0];
        for(int i=0; i< arr.length; i++){
            if(arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest){
                smallest = arr[i];
            }
        }
        int difference = largest - smallest;
        System.out.print("Total " +difference);
    }
}
