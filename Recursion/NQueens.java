package com.gla.Recursion;

public class NQueens {
    static int[] board;
    static boolean[] columns;
    static boolean[] diagonal1;
    static boolean[] diagonal2;

    static boolean solve(int row, int n) {
        if (row == n) {
            return true;
        }

        for (int col = 0; col < n; col++) {
            int d1 = row - col + n - 1;
            int d2 = row + col;

            if (!columns[col] && !diagonal1[d1] && !diagonal2[d2]) {
                board[row] = col;
                columns[col] = true;
                diagonal1[d1] = true;
                diagonal2[d2] = true;

                if (solve(row + 1, n)) {
                    return true;
                }

                columns[col] = false;
                diagonal1[d1] = false;
                diagonal2[d2] = false;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 4;

        board = new int[n];
        columns = new boolean[n];
        diagonal1 = new boolean[2 * n - 1];
        diagonal2 = new boolean[2 * n - 1];

        if (solve(0, n)) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i] == j ? "Q " : ". ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No Solution");
        }
    }
}
