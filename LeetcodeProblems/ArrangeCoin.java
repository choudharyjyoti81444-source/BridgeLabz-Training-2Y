package com.gla.LeetcodeProblems;

import java.util.*;
public class ArrangeCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int row = 0;
        while (n >= row + 1) {
            row++;
            n = n - row;
        }

        System.out.println(row);
    }
}
