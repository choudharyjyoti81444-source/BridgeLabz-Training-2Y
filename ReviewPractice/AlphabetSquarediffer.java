package com.gla.DSA.DailyFocusArray.ReviewPractice;

import java.util.Scanner;

public class AlphabetSquarediffer {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            char ch;
            if(i==0){
                ch = 'a';
            }else{
                ch = (char)('A'+i);
            }
            for(int j=0;j<n;j++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
