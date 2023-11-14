package Backtracking;

public class nQueenProblem {
    public static void printSolution(int[][] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int[][] board, int row, int column, int n) {
        int i, j;

        // Check on the left row
        for (i = 0; i < column; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        // Check upper diagonal on left
        for (i = row, j = column; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check lower diagonal on left
        for (i = row, j = column; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public static boolean solveNQueen(int[][] board, int column, int n) {
        if (column >= n) {
            return true;
        }
        for (int i = 0; i < n; i++) {
            if (isSafe(board, i, column, n)) {
                board[i][column] = 1;
                if (solveNQueen(board, column + 1, n)) {
                    return true;
                }
                board[i][column] = 0; // Backtrack
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int board[][] = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        if (solveNQueen(board, 0, board.length)==true) {
            printSolution(board, board.length);
        } else {
            System.out.println("Solution does not exist");
        }
    }
}
