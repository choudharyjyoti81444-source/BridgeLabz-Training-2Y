package com.gla.LeetcodeProblems;

import java.util.Scanner;
public class ConstructRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int area = sc.nextInt();

        int w = (int) Math.sqrt(area);
        while (area % w != 0) {
            w--;
        }

        int l = area / w;
        System.out.println("[" + l + ", " + w + "]");
    }
}
