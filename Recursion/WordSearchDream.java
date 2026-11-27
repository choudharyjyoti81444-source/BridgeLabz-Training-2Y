package com.gla.Recursion;
import java.util.*;
public class WordSearchDream {
    static char[][] grid = {
            {'C', 'A', 'T', 'S'},
            {'O', 'R', 'E', 'A'},
            {'D', 'E', 'A', 'M'},
            {'E', 'L', 'L', 'S'}
    };

    static String word = "DREAM";
    static boolean[][] visited = new boolean[4][4];

    static int[] row = {-1, 1, 0, 0, -1, -1, 1, 1};
    static int[] col = {0, 0, -1, 1, -1, 1, -1, 1};

    static boolean search(int r, int c, int index) {
        if (index == word.length()) {
            return true;
        }

        if (r < 0 || c < 0 || r >= 4 || c >= 4 ||
                visited[r][c] || grid[r][c] != word.charAt(index)) {
            return false;
        }

        visited[r][c] = true;

        for (int i = 0; i < 8; i++) {
            if (search(r + row[i], c + col[i], index + 1)) {
                return true;
            }
        }

        visited[r][c] = false;
        return false;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (grid[i][j] == word.charAt(0) &&
                        search(i, j, 0)) {
                    System.out.println("Word Found");
                    return;
                }
            }
        }

        System.out.println("Word Not Found");
    }
}
