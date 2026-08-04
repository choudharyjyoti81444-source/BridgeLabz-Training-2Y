package com.gla.DSA.PatternPrinting;

import java.util.Scanner;

public class SecondMaximumElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Element An Element:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " Element");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int secmax = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                secmax = max;
                max = arr[i];
            }
        }
        System.out.println("Answer:" +secmax);
    }
}
