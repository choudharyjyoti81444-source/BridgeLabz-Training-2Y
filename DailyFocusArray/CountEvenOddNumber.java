package com.gla.DSA.DailyFocusArray;
import java.util.*;
public class CountEvenOddNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an ELement");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter" + n + "element");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int EvenCount = 0;
        int OddCount = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
               System.out.println("Even Number");
               EvenCount++;
            }
            else{
                System.out.println("Odd Number");
                OddCount++;
            }
        }
        System.out.println("Total Even Number" +EvenCount);
        System.out.println("Total Odd Number" +OddCount);
    }
}
