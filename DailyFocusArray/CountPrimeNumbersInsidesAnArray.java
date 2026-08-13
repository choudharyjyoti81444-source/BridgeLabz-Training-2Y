package com.gla.DSA.Class;

import java.util.Scanner;

public class CountPrimeNumbersInsidesAnArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Element:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " +n+ " Element");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for(int i=0; i<n; i++) {
            if(arr[i] <= 1) {
                continue;
            }

            int prime = 1;
            for(int j=2; j<arr[i]; j++) {
                if(arr[i] % j == 0) {
                    prime = 0;
                    break;
                }
            }

            if(prime == 1) {
                count++;
            }
        }
        System.out.println("Total Prime Numbers = " + count);
    }
}
