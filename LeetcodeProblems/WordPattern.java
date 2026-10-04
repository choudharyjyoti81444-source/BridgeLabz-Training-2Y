package com.gla.LeetcodeProblems;

import java.util.*;
public class WordPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pattern = sc.nextLine();
        String s = sc.nextLine();

        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            System.out.println(false);
            return;
        }

        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> reverseMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(ch) && !map.get(ch).equals(word)) {
                System.out.println(false);
                return;
            }

            if (reverseMap.containsKey(word) && reverseMap.get(word) != ch) {
                System.out.println(false);
                return;
            }

            map.put(ch, word);
            reverseMap.put(word, ch);
        }

        System.out.println(true);
    }
}
