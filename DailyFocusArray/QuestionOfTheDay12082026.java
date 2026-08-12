package com.gla.DSA.Class;

import java.util.Scanner;
public class QuestionOfTheDay11082026 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array:");
        System.out.print("Enter Target Element:");
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter an Array");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j] && arr[i-j]<=k){
                    System.out.print("True");
                    break;
                }
                else{
                    System.out.print("false");
                    break;
                }
            }
            break;
        }
    }
}
