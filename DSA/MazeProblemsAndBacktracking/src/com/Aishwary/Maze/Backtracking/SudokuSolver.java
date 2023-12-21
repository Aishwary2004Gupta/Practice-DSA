package com.Aishwary.Maze.Backtracking;

public class SudokuSolver {
    public static void main(String[] args) {
        //create sudoku
        int[][] board = new int[][] {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        if (solve(board)){
            display(board);
        } else {
            System.out.println("Cannot solve the board");
        }
    }
    static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean empty = true;

        //this if how we are replacing r, c from argument
        for (int i = 0; i < n; i++) { //for every single element
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0){
                        row = i;
                        col = j;
                        empty = false;
                        break; // found one possible answer
                }
            }
            //if you have found some empty element in row, then break
            if (empty == false){
                break;
            }
        }
        if (empty == true){
            return true;
            //sudoku is solved
        }

        //backtrack
        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)){
                board[row][col] = number; //put it over there
                if (solve(board)){
                    //found the answer
                    return true;
                } else {
                    //backtrack
                    board[row][col] = 0; //replace that changes
                }
            }
        }
        return false; // sudoku cant be solved
    }

    private static void display(int[][] board) {
        for(int[] row : board){
            for(int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board, int row, int col, int num){
        //check for row
        for (int i = 0; i < board.length; i++) {
            //check if the num is in the row
            if (board[row][i] == num){ //already present before
                return false;
            }
        }

        //check for col
        for (int[] nums : board) {
            //check if the num is in the col
            if (nums[col] == num){ //for same col different rows
                return false;
            }
        }

        int sqrt = (int)(Math.sqrt(board.length)); //under root 9 = 3
        int rowStart = row - row % sqrt;
        int colStart  = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) { //going 3 times left from rowStart
            for (int c = colStart; c < colStart + sqrt; c++) { // going 3 times down from colStart
                if (board[r][c] == num){
                    return false;
                }
            }
        }
        return true;
    }
}
