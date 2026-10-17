package com.gla.LeetcodeProblems;
import java.util.*;
public class FindComplement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int mask = 1;

        while (mask < num) {
            mask = (mask << 1) | 1;
        }

        System.out.println(num ^ mask);
    }
}
