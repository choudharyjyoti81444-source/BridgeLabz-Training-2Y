package com.gla.LeetcodeProblems;

import java.util.*;
public class IsAcronym {
    public static boolean helper(List<String> words, String s, int index) {
        if (index == s.length()) {
            return true;
        }

        if (words.get(index).charAt(0) != s.charAt(index)) {
            return false;
        }

        return helper(words, s, index + 1);
    }

    public static boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) {
            return false;
        }

        return helper(words, s, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<String> words = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            words.add(sc.next());
        }

        String s = sc.next();
        System.out.println(isAcronym(words, s));
    }
}
