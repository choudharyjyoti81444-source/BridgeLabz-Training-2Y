package com.gla.LeetcodeProblems;

import java.util.*;
public class ConvertToBase7 {public static String base(int n) {
    if (n < 7) {
        return String.valueOf(n);
    }
    return base(n / 7) + (n % 7);
}

    public static String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        if (num < 0) {
            return "-" + base(-num);
        }
        return base(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(convertToBase7(num));
    }
}
