package com.gla.LeetcodeProblems;

import java.util.*;
public class BinaryWatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int turnedOn = sc.nextInt();

        List<String> result = new ArrayList<>();
        for (int hour = 0; hour < 12; hour++) {
            for (int minute = 0; minute < 60; minute++) {

                int count = Integer.bitCount(hour)
                        + Integer.bitCount(minute);

                if (count == turnedOn) {
                    result.add(String.format("%d:%02d", hour, minute));
                }
            }
        }

        System.out.println(result);
    }
}
