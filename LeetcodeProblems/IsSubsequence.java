package com.gla.LeetcodeProblems;
import java.util.Scanner;
public class IsSubsequence {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter s: ");
        String s = sc.nextLine();

        System.out.print("Enter t: ");
        String t = sc.nextLine();

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }

            j++;
        }

        System.out.println(i == s.length());
    }

}
