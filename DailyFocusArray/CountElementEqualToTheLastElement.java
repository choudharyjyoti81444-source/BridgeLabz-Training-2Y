package com.gla.DSA.DailyFocusArray;

import java.util.Scanner;

public class CountElementEqualToTheLastElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Element: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " +n+ " Element ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int key = arr[arr.length-1];
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                count++;
            }
        }
        System.out.print("Total = " +count);
    }
}
