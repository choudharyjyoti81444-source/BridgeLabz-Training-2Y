package com.gla.DSA.DailyFocusArray;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter An Element:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " Element");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        boolean found = false;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
            System.out.println("Element Found: " +i);
            found = true;
            break;
            }
        }
        if(!found){
        System.out.println("Element Not Found");
        }
    }
}
