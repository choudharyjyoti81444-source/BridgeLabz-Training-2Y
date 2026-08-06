package com.gla.DSA.DailyFocusArray.ReviewPractice;

import java.util.Scanner;

public class Five_Star {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("no. of rows:");
        int row= sc.nextInt();
        System.out.println("no. of column:");
        int col= sc.nextInt();
        for(int i=1;i<=row;i++){ // kitni line hogi
            for(int j=1;j<=col;j++){// har line mai kitna print hoga

                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
