package com.gla.LeetcodeProblems;

import java.util.Scanner;
public class ConvertToTitle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter column number: ");
        int columnNumber = sc.nextInt();

        String ans = "";

        while (columnNumber > 0) {

            columnNumber--;

            char ch = (char) ('A' + (columnNumber % 26));

            ans = ch + ans;

            columnNumber = columnNumber / 26;
        }

        System.out.println("Column Title: " + ans);
    }
}
