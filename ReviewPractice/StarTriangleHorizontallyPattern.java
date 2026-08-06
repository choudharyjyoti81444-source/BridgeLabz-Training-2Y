package com.gla.DSA.DailyFocusArray.ReviewPractice;

import java.util.Scanner;

public class StarTriangleHorizontallyPattern {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n ;j>=i;j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
