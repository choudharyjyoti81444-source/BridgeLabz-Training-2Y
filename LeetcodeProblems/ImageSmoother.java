package com.gla.LeetcodeProblems;
import java.util.*;
public class ImageSmoother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] img = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                img[i][j] = sc.nextInt();
            }
        }

        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                int count = 0;

                for (int x = i - 1; x <= i + 1; x++) {
                    for (int y = j - 1; y <= j + 1; y++) {

                        if (x >= 0 && x < m && y >= 0 && y < n) {
                            sum += img[x][y];
                            count++;
                        }
                    }
                }
                ans[i][j] = sum / count;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
