package com.gla.DSA.Class;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter s1 String:");
        String s1 = sc.nextLine();

        System.out.println("Enter s2 String:");
        String s2 = sc.nextLine();

        s1 = s1.toLowerCase().replaceAll("\\s","");
        s2 = s2.toLowerCase().replaceAll("\\s","");

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.equals(a,b));
    }
}
