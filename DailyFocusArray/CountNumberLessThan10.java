package com.gla.DSA.DailyFocusArray;

import java.util.Scanner;

public class CountNumberLessThan10 {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter an Element: ");
       int n = sc.nextInt();

       int[] arr = new int[n];

       System.out.print("Enter " +n+ " Element ");
       for(int i=0; i<arr.length; i++){
           arr[i] = sc.nextInt();
       }

       int count = 0;
       for(int i=0; i<arr.length; i++){
           if(arr[i] < 10){
               count++;
           }
       }
       System.out.print("Number less than 10 = " +count);
   }
}

