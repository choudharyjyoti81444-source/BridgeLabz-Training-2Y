package com.gla.LeetcodeProblems;

import java.util.*;
public class FindWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> result = new ArrayList<>();

        for (String word : words) {
            String w = word.toLowerCase();

            boolean first = true;
            boolean second = true;
            boolean third = true;

            for (int i = 0; i < w.length(); i++) {
                char ch = w.charAt(i);

                if (row1.indexOf(ch) == -1) {
                    first = false;
                }

                if (row2.indexOf(ch) == -1) {
                    second = false;
                }

                if (row3.indexOf(ch) == -1) {
                    third = false;
                }
            }

            if (first || second || third) {
                result.add(word);
            }
        }

        System.out.println(result);
    }
}
