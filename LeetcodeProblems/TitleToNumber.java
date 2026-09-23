package com.gla.LeetcodeProblems;

import java.util.Scanner;
public class TitleToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter column title: ");
        String columnTitle = sc.nextLine();

        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            result = result * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }

        System.out.println("Column Number: " + result);
    }
}
