package com.gla.DSA.DailyFocusArray.ReviewPractice;

import java.util.Scanner;

public class Alphabet_Square {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("no. of element: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char) (j+96) +" ");
            }
            System.out.println();
        }
    }
}
