package com.Aishwary.Maze.Backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));

    }                                       //starting col from 0 every time
    static int queens(boolean[][] board, int row){ //no. of way's you can print it
        if (row == board.length){ //means all the queens has been places
            display(board);
            System.out.println();
            return 1;

        }

        int count = 0;

        //placing the queen, and checking for every row and col
        for (int col = 0; col < board.length; col++) { //since it is an even board
            // place the queen if it is safe
            if (isSafe(board, row, col)) {
                board[row][col] = true; //going in
                count += queens(board, row + 1);
                board[row][col] = false; //after coming out change it to normal
                                         // comes out only if queen in not safe to be placed
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]){ //is true
                return false; //not safe to put the queen
            }
        }
        //no need to check for down

        //for diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) { //[-1, -1]
            if (board[row-1][col-1]){ //if board of row and col is decreasing
                return false; //if the above line is true
            }
        }

        //for diagonal Right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) { // [+1,-1]
            if (board[row-1][col+1]){ //if board of row decreasing and col is increasing
                return false; //if the above line is true
            }
        }
        return true; //if nothing return false that means queen can be placed
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board){ //for every row in my board
            for (boolean element : row){ //for element in my row
                if (element){ //element = true (can be placed)
                    System.out.print("Q ");
                }else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
