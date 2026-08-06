package com.gla.DSA.DailyFocusArray.ReviewPractice;

import java.util.Scanner;

public class one_input_for_i_and_j {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("no of rows:");
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
