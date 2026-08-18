package com.gla.DSA.Class;

import java.util.Scanner;

public class InsertAnElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of an Element:");
        int n = sc.nextInt();

        int[] arr = new int[n+1];

        System.out.println("Enter " +n+ " Element" );
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a position ");
        int pos = sc.nextInt();

        System.out.println("Enter an Element");
        int ele = sc.nextInt();

        for(int i=n; i>=pos; i--){
            arr[i] = arr[i-1];
        }

        arr[pos-1] = ele ;

        System.out.println("enter an Arrays");
        for(int i=0; i<=n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
