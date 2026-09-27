package com.gla.LeetcodeProblems;

import java.util.*;
public class IslandPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int m = sc.nextInt();

        System.out.print("Enter columns: ");
        int n = sc.nextInt();

        int[][] grid = new int[m][n];

        System.out.println("Enter grid elements (0 or 1):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int perimeter = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 1) {
                    perimeter += 4;

                    if (i > 0 && grid[i - 1][j] == 1) {
                        perimeter--;
                    }

                    if (j > 0 && grid[i][j - 1] == 1) {
                        perimeter--;
                    }

                    if (i < m - 1 && grid[i + 1][j] == 1) {
                        perimeter--;
                    }

                    if (j < n - 1 && grid[i][j + 1] == 1) {
                        perimeter--;
                    }
                }
            }
        }

        System.out.println("Island Perimeter: " + perimeter);
    }
}
